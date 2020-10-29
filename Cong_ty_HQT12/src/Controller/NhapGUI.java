
package Controller;

import Classes.ChiTietHDN;
import Classes.DonVi;
import Classes.HDNhap;
import Classes.HDXuat;
import Classes.SanPham;
import Connect.ConnecttionDB;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class NhapGUI {
    ConnecttionDB con = new ConnecttionDB();
    ChiTietHDN ctHDN = new ChiTietHDN();
    
    public ArrayList<SanPham> getSP(String mahdx) throws Exception {
        ArrayList<SanPham> dssp = new ArrayList<>();
        if (mahdx.trim().equals("")) {
            return new ArrayList<>();
        }
        String sql = "Select hdnsp.masp, Sanpham.tensanpham, Sanpham.mausac, Sanpham.thongsokythuat, hdnsp.slsp, hdnsp.gianhap"
                + " from hdnsp join Sanpham on hdnsp.masp = Sanpham.masp where mahdn = '" + mahdx + "'";
        ResultSet rs = con.queryData(sql);
        while (rs.next()) {
            dssp.add(new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6)));
        }
        return dssp;
    }
    
    public boolean checkHDN(String maDVN) throws Exception {
        ResultSet rs = null;
        String sql = "select mahdn from HDNhap where mahdn ='" + maDVN + "'";
        rs = con.queryData(sql);
        if (rs.next()) {
            return true;
        }
        return false;
    }
    
    public boolean checkDVN(String maDVX) throws Exception {
        ResultSet rs = null;
        String sql = "select madvnhap from DVNhap where madvnhap ='" + maDVX + "'";
        rs = con.queryData(sql);
        if (rs.next()) {
            return true;
        }
        return false;
    }

    public boolean checkSPN(String maDVX) throws Exception {
        ResultSet rs = null;
        String sql = "select masp from Sanpham where masp ='" + maDVX + "'";
        rs = con.queryData(sql);
        if (rs.next()) {
            return true;
        }
        return false;
    }
 
    public void themDVN(DonVi dv) throws Exception {
        String Sql = "insert into DVNhap(madvnhap, tendvnhap, diachi, sdt, email) "
                + "values('" + dv.getMaDV() + "','" + dv.getTenDV() + "','" + dv.getDiachi() + "','" + dv.getSdt() + "','" + dv.getEmail() + "')";
        Statement statement = con.getStatement();
        statement.execute(Sql);
    }
    
    public void updateDVN(HDNhap hdx) throws Exception {
        String sql = "update DVNhap set tendvnhap = '" + hdx.getDvn().getTenDV() + "',diachi ='" + hdx.getDvn().getDiachi()
                + "' ,sdt='" + hdx.getDvn().getSdt() + "',email='" + hdx.getDvn().getEmail() 
                +  "' where  madvnhap = '" + hdx.getDvn().getMaDV() + "'";
        Statement statement = con.getStatement();
        statement.execute(sql);
    }
    
    public boolean themHDN(HDNhap hdx) throws Exception {

        if (checkHDN(hdx.getMaHDN())) {
            JOptionPane.showMessageDialog(null, "Mã hoá đơn đã tồn tại");
        } else {
            if (!checkDVN(hdx.getDvn().getMaDV())) {
                themDVN(hdx.getDvn());
            } else {
                updateDVN(hdx);
                String sql = "insert into HDNhap values ('" + hdx.getMaHDN()+ "','" + hdx.getDvn().getMaDV() + "','" + hdx.getNgayN()
                        + "','" + hdx.getMaNV()+ "'," + hdx.getSlSPN()+ ")";
                Statement statement = con.getStatement();
                statement.execute(sql);
                return true;
            }
        }
        return false;
    }
    
    public void themCTPN(String maHDX, String maSP, int slSP, double giaXuat) throws Exception {
        if (!checkHDN(maHDX) && checkSPN(maSP)) {
            JOptionPane.showMessageDialog(null, "Sản phẩm đã được thêm");
            return;
        }
        String sql = "insert into hdnsp values ('" + maHDX + "','" + maSP + "'," + slSP + "," + giaXuat + ")";
        Statement statement = con.getStatement();
        statement.execute(sql);
        sql = "update Sanpham set soluongton = (soluongton + " + slSP + ") where masp = '" + maSP + "'";
        statement.execute(sql);
    }
    
    public boolean checkcthd(String mahdx) throws Exception {
        String sql = "select 1 from hdnsp where mahdn = '" + mahdx + "'";
        ResultSet rs = con.queryData(sql);
        if (rs.next()) {
            return true;
        }
        return false;
    }
    
    public boolean deleteNhap(String mahdx) throws Exception {

        if (checkHDN(mahdx)) {
            String sql = "delete hdnsp where mahdn ='" + mahdx + "'";
            Statement statement = con.getStatement();
            statement.execute(sql);
        }
        String sql = "delete HDNhap where mahdn = '" + mahdx + "'";
        Statement statement = con.getStatement();
        statement.execute(sql);

        if (!checkHDN(mahdx) && !checkcthd(mahdx)) {
            return true;
        }
        return false;
    }
    
    public boolean updateHDN(String mhdx, String mdvx, String date, String manv, int sl) throws Exception {
        if (checkHDN(mhdx)) {
            String sql = "update HDNhap set madvnhap = '" + mdvx + "',ngaynhap = '" + date
                    + "',manv = '" + manv + "',slspn =" + sl + " where mahdn = '" + mhdx + "'";
            Statement statement = con.getStatement();
            statement.execute(sql);
            return true;
        }
        return false;
    }
     public DonVi getDVN(String madvx) throws Exception {
        ArrayList<DonVi> listSP = con.reusltListDVN();
        for (DonVi item : listSP) {
            if (item.getMaDV().trim().equals(madvx.trim())) {
                return item;
            }
        }

        return null;
    }


    public static void main(String[] args) throws Exception {
        NhapGUI a = new NhapGUI();
        System.out.println(a.checkcthd("hdn01"));
        System.out.println(a.updateHDN("hdn01", "a", "2020-06-19", "nv03", 3));
//        a.updateDVN(new HDNhap("hdn02", "2020-06-15", "nv02", 2, new DonVi("a0", "11111", "Ha Noi", "11", "abb")));
//        System.out.println(a.themHDN(new HDNhap("hdn02", "2020-06-15", "nv02", 2, new DonVi("a0", "aaa", "Ha Noi", "11", "abb"))));
    }
}
