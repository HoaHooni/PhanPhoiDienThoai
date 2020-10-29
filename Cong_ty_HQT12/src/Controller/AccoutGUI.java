
package Controller;

import Classes.NhanVien;
import java.awt.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import Connect.ConnecttionDB;


public class AccoutGUI {
    ArrayList<NhanVien> list;

    public AccoutGUI() throws Exception {
        list = new ArrayList<>();
        ConnecttionDB conn = new ConnecttionDB();
        String sql = "select * from Nhanvien";
        ResultSet rs = conn.queryData(sql);
        while(rs.next()){
            list.add(new NhanVien(rs.getString(1), rs.getString(2)));
        }
    }

    public AccoutGUI(ArrayList<NhanVien> list) {
        this.list = list;
    }

    public void setList(ArrayList<NhanVien> list) {
        this.list = list;
    }
    public boolean checkAcc(String name, String pass){
        
        
        for( NhanVien item: list){
            if(item.getTk().trim().equals(name)&& item.getMk().trim().equals(pass)){
                return true;
            }
        }
        return false;
    }
    
//    public static void main(String[] args) throws Exception {
//        AccoutGUI a = new AccoutGUI();
//        
//        System.out.println(a.checkAcc("nv01", "1"));
//    }
}
