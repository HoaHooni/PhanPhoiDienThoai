package Controller;

import Classes.HDXuat;
import Classes.Kho;
import Classes.SanPham;
import Connect.ConnecttionDB;
import java.sql.ResultSet;

import Connect.ConnecttionDB;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class KhoGUI {

    ConnecttionDB con = new ConnecttionDB();
    ArrayList<Kho> list = new ArrayList<>();

    public ArrayList<Kho> getSP() throws Exception {
//        list = new ArrayList<>();
        String sql = "Select * from Sanpham";

        ResultSet rs = con.queryData(sql);
        while (rs.next()) {
            list.add(new Kho(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
        }
        return list;
    }

    public boolean checkSPX(String maDVX) throws Exception {
        ResultSet rs = null;
        String sql = "select 1 from Sanpham where masp ='" + maDVX.trim() + "'";
        rs = con.queryData(sql);
        if (rs.next()) {
            return true;
        }
        return false;
    }

    public boolean themsp(String masp, String tensp, String mausac, String thongso, int soluongton, String tinhtrang, int songayton, String cachxuly, int slxuly, int ptgiamgoa) throws Exception {
        if (!checkSPX(masp)) {
            String sql = "insert into [dbo].[Sanpham] values ('" + masp + "','" + tensp + "','" + mausac + "','" + thongso + "', " + soluongton
                    + " ,'" + tinhtrang + "',  " + songayton + ",'" + cachxuly + "', " + slxuly + " , " + ptgiamgoa + " )";
            Statement statement = con.getStatement();
            statement.execute(sql);
            return true;
        }
        return false;
    }

    public boolean updatesp(String masp, String tensp, String mausac, String thongso, int soluongton, String tinhtrang, int songayton, String cachxuly, int slxuly, int ptgiamgoa) throws Exception {
        if (checkSPX(masp)) {
            String sql = "update Sanpham set tensanpham = '" + tensp + "',mausac ='" + mausac
                    + "',thongsokythuat='" + thongso + "' ,soluongton= " + soluongton
                    + ",tinhtrang='" + tinhtrang + "',songayton=" + songayton + ",cachxuly='" + cachxuly
                    + "',slxuly=" + slxuly + ",ptgiamgia=" + ptgiamgoa + " where  masp = '" + masp + "'";
            Statement statement = con.getStatement();
            statement.execute(sql);
            return true;
        }

        return false;
    }

    public ArrayList<Kho> searchKho(String col, String key) throws Exception {

        list.removeAll(list);
        ResultSet rs = con.queryData("Select * from Sanpham where " + col + " like '%" + key + "%'");
        while (rs.next()) {
            list.add(new Kho(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
        }
        return list;
    }
public Kho getSP(String masp) throws Exception {
     KhoGUI kho =new KhoGUI();
        ArrayList<Kho> listSP = kho.getSP();
        for (Kho item : listSP) {
            if (item.getMaSP().trim().equals(masp.trim())) {
                return item;
            }
        }
        return null;
    }


    public static void main(String[] args) throws Exception {
        KhoGUI a = new KhoGUI();

        System.out.println(a.themsp("sp09", "Sony", "white", "87892", 0, "tot", 78, "thanh ly", 0, 1));

        System.out.println(a.updatesp("sp06", "samsung", "white", "87892", 0, "cu", 78, "thanoh ly", 0, 1));

    }
}
