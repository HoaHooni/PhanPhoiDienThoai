package Connect;

import Classes.DonVi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Classes.NhanVien;


public class ConnecttionDB {

    private Connection conn = null;
    private String url = "jdbc:sqlserver://DESKTOP-7VDPE8B\\SQLEXPRESS:1433;database=CongTyHQT;integratedSecurity=true;";
    private Statement st = null;
    private ResultSet rs = null;
    String name1="a";
    String pass1="1";
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public ConnecttionDB() {
        try {
            Class.forName(driver);
             conn = DriverManager.getConnection(url,name1,pass1);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "Không thể nạp dữ liệu: " + ex.toString(), "Error", JOptionPane.OK_OPTION);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Kết nối CSDL thất bái " + ex.toString(), "Error", JOptionPane.OK_OPTION);
        }
    }

    public void establishConnect(String url, String user, String pass) {
        //Đăng ký driver để sử dụng sql

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "Không thể nạp dữ liệu: " + ex.toString(), "Error", JOptionPane.OK_OPTION);
            System.exit(1);
        }
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Không thể kết nối csdl: " + ex.toString(), "Error", JOptionPane.OK_OPTION);
            System.exit(1);
        }
    }

    //Hàm này tạo ra đối tượng thực thi câu lệnh
    public Statement getStatement() throws Exception {
        if (this.st == null || this.st.isClosed()) {
            this.st = this.conn.createStatement();
        }
        return this.st;
    }

    public ResultSet queryData(String query) throws Exception {
        try {
            rs = getStatement().executeQuery(query);
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Không thể kết nối csdl: " + ex.toString(), "Error", JOptionPane.OK_OPTION);
        }
        return rs;
    }
 public ArrayList<DonVi> reusltListDVN() throws Exception {
        ArrayList<DonVi> list = new ArrayList<>();

        String sql = "select * from DVNhap";
        ResultSet rs = queryData(sql);
        while (rs.next()) {
            list.add(new DonVi(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        }
        return list;
    }
       public ArrayList<DonVi> reusltListDVX() throws Exception {
        ArrayList<DonVi> list = new ArrayList<>();

        String sql = "select * from DVXuat";
        ResultSet rs = queryData(sql);
        while (rs.next()) {
            list.add(new DonVi(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        }
        return list;
    }
}
