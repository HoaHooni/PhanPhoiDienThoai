package Controller;

import Classes.ChiTietHDX;
import Classes.DonVi;
import Classes.HDXuat;
import Classes.SanPham;
import Connect.ConnecttionDB;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class XuatGUI {

    ConnecttionDB con = new ConnecttionDB();
    ChiTietHDX cthdx = new ChiTietHDX();

    public ArrayList<SanPham> getSP(String mahdx) throws Exception {
        ArrayList<SanPham> dssp = new ArrayList<>();
        if (mahdx.trim().equals("")) {
            return new ArrayList<>();
        }

        String sql = "Select hdxsp.masp, Sanpham.tensanpham, Sanpham.mausac, Sanpham.thongsokythuat, hdxsp.slsp, hdxsp.giaxuat"
                + " from hdxsp join Sanpham on hdxsp.masp = Sanpham.masp where mahdx = '" + mahdx + "'";
        ResultSet rs = con.queryData(sql);
        while (rs.next()) {
            dssp.add(new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6)));
        }
        return dssp;
    }

    public boolean checkHDX(String maDVX) throws Exception {
        ResultSet rs = null;
        String sql = "select mahdx from HDXuat where mahdx ='" + maDVX + "'";
        rs = con.queryData(sql);
        if (rs.next()) {
            return true;
        }
        return false;
    }

    public boolean checkDVX(String maDVX) throws Exception {
        ResultSet rs = null;
        String sql = "select madvxuat from DVXuat where madvxuat ='" + maDVX + "'";
        rs = con.queryData(sql);
        if (rs.next()) {
            return true;
        }
        return false;
    }

    public boolean checkSPX(String maDVX) throws Exception {
        ResultSet rs = null;
        String sql = "select masp from Sanpham where masp ='" + maDVX + "'";
        rs = con.queryData(sql);
        if (rs.next()) {
            return true;
        }
        return false;
    }

    public boolean checkSPX(String maDVX, int slSP) throws Exception {
        ResultSet rs = null;
        String sql = "select masp from Sanpham where masp ='" + maDVX + "' and soluongton >" + slSP;
        rs = con.queryData(sql);
        if (rs.next()) {
            return true;
        }
        return false;
    }

    public void themDVX(DonVi dv) throws Exception {
        String Sql = "insert into DVXuat(madvxuat, tendvxuat, diachi, sdt, email, congno) "
                + "values('" + dv.getMaDV() + "','" + dv.getTenDV() + "','" + dv.getDiachi() + "','" + dv.getSdt() + "','" + dv.getEmail() + "',0)";
        Statement statement = con.getStatement();
        statement.execute(Sql);
    }

    public void themCTPX(String maHDX, String maSP, int slSP, double giaXuat) throws Exception {
        if (!checkHDX(maHDX) && checkSPX(maSP)) {
            JOptionPane.showMessageDialog(null, "Sản phẩm đã được thêm");
            return;
        }
        String sql = "insert into hdxsp values ('" + maHDX + "','" + maSP + "'," + slSP + "," + giaXuat + ")";
        Statement statement = con.getStatement();
        statement.execute(sql);
        sql = "update Sanpham set soluongton = (soluongton - " + slSP + ") where masp = '" + maSP + "'";
        statement.execute(sql);
    }

    public void updateDVX(HDXuat hdx) throws Exception {
        String sql = "update DVXuat set tendvxuat = '" + hdx.getDvn().getTenDV() + "',diachi ='" + hdx.getDvn().getDiachi()
                + "' ,sdt='" + hdx.getDvn().getSdt() + "',email='" + hdx.getDvn().getEmail() + "' ,congno= " + hdx.getCongno()
                + " where  madvxuat = '" + hdx.getDvn().getMaDV() + "'";
        Statement statement = con.getStatement();
        statement.execute(sql);
    }

    public boolean themHDX(HDXuat hdx) throws Exception {

        if (checkHDX(hdx.getMaHDX())) {
            JOptionPane.showMessageDialog(null, "Mã hoá đơn đã tồn tại");
        } else {
            if (!checkDVX(hdx.getDvn().getMaDV())) {
                themDVX(hdx.getDvn());
            } else {
                updateDVX(hdx);
                String sql = "insert into HDXuat values ('" + hdx.getMaHDX() + "','" + hdx.getDvn().getMaDV() + "','" + hdx.getNgayXuat()
                        + "','" + hdx.getManvString() + "'," + hdx.getSlSPX() + ")";
                Statement statement = con.getStatement();
                statement.execute(sql);
                return true;
            }
        }
        return false;
    }

    public boolean checkcthd(String mahdx) throws Exception {
        String sql = "select 1 from hdxsp where mahdx = '" + mahdx + "'";
        ResultSet rs = con.queryData(sql);
        if (rs.next()) {
            return true;
        }
        return false;
    }

    public boolean deleteXuat(String mahdx) throws Exception {

        if (checkcthd(mahdx)) {
            String sql = "delete [dbo].[hdxsp] where mahdx ='" + mahdx + "'";
            Statement statement = con.getStatement();
            statement.execute(sql);
        }
        String sql = "delete [dbo].[HDXuat] where mahdx = '" + mahdx + "'";
        Statement statement = con.getStatement();
        statement.execute(sql);

        if (!checkHDX(mahdx) && !checkcthd(mahdx)) {
            return true;
        }
        return false;
    }
    
    public boolean deleteCTHDX(String mahdx) throws Exception {

        
        String sql = "delete [dbo].[HDXuat] where mahdx = '" + mahdx + "'";
        Statement statement = con.getStatement();
        statement.execute(sql);

        if (!checkHDX(mahdx) && !checkcthd(mahdx)) {
            return true;
        }
        return false;
    }

    public boolean updateHDX(String mhdx, String mdvx, String date, String manv, int sl) throws Exception {
        if (checkHDX(mhdx)) {
            String sql = "update HDXuat set [madvxuat] = '" + mdvx + "',[ngayxuat] = '" + date
                    + "',[manv] = '" + manv + "',[slspx] =" + sl + " where [mahdx] = '" + mhdx + "'";
            Statement statement = con.getStatement();
            statement.execute(sql);
            return true;
        }
        return false;
    }

    public boolean checkcthd(String mahdx, String masp) throws Exception {
        String sql = "select 1 from hdxsp where mahdx = '" + mahdx + "' and masp = '" + masp + "'";
        ResultSet rs = con.queryData(sql);
        if (rs.next()) {
            return true;
        }
        return false;
    }

    public void updateCTHDX(String maHDX, String maSP, int sl, double gia) throws Exception {
        if (!checkcthd(maHDX, maSP)) {
            JOptionPane.showMessageDialog(null, "Khong ton tai san pham");
            return;
        }
        String sql = "update [hdxsp] set slsp = " + sl + ", giaxuat = " + gia + " where mahdx = '" + maHDX + "' and masp ='" + maSP + "'";
        Statement statement = con.getStatement();
        statement.execute(sql);

    }
public DonVi getDVX(String madvx) throws Exception {
        ArrayList<DonVi> listSP = con.reusltListDVX();
        for (DonVi item : listSP) {
            if (item.getMaDV().trim().equals(madvx.trim())) {
                return item;
            }
        }

        return null;
    }
    public static void main(String[] args) throws Exception {
        XuatGUI a = new XuatGUI();

        a.updateCTHDX("hdx01", "sp02", 60, 100000);
        System.out.println(a.updateHDX("hdx02", "dvx03", "1999-06-15", "nv03", 15));
    }

}
