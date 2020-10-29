package CustomTable;

import Classes.ChiTietHDN;
import Classes.ChiTietHDX;
import Classes.HDNhap;
import Classes.HDXuat;
import Classes.SanPham;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CustomTable_Nhap extends AbstractTableModel {

    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[] = {"Mã sản phẩm", "Tên sản phẩm", "Màu sắc", "Thông số kỹ thuật", "Số lượng", "Giá xuất", "Thành tiền"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class, String.class, String.class, Integer.class, Double.class, Double.class};
    //Tạo một đối tượng arrayList có tên hàng nhập.
    private ChiTietHDN hdx;

    //phương thức khởi tạo cho class có tham số truyền vào.
    public CustomTable_Nhap(ChiTietHDN hdx) {
        this.hdx = hdx;
    }

    //lấy số phần tử của listThiSinh
    @Override
    public int getRowCount() {
        return hdx.getListSP().size();
    }

    //Lấy số lượng tiêu để của mảng.
    @Override
    public int getColumnCount() {
        return name.length;
    }

    //Đưa thông tin của phần tử trong arrayList lên jTable
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            //Cột mã hóa đơn
            case 0:
                return hdx.getListSP().get(rowIndex).getMaSP();
            //Cột đơn vị nhập
            case 1:
                return hdx.getListSP().get(rowIndex).getTenSP();
            //cột sản phẩm
            case 2:
                return hdx.getListSP().get(rowIndex).getMauSac();
            //cột nhân viên
            case 3:
                return hdx.getListSP().get(rowIndex).getThongso();
            //cột số lượng 
            case 4:
                return hdx.getListSP().get(rowIndex).getSoLuong();
            case 5:
                return hdx.getListSP().get(rowIndex).getGia();
            //Cột đơn vị nhập
            case 6:
                return hdx.getListSP().get(rowIndex).getSoLuong() * hdx.getListSP().get(rowIndex).getGia();

            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
    
    public static void main(String[] args) {
        ChiTietHDN hdx = new ChiTietHDN();
        ArrayList<SanPham> dsspn = new ArrayList<>();
        dsspn.add(new SanPham("!!!!!!!!", "@@@@@", "####", "$$$$$", 10, 5000000));
        hdx = new ChiTietHDN( new HDNhap(),dsspn);
        CustomTable_Nhap a = new CustomTable_Nhap(hdx);
        System.out.println(a.getRowCount());
    }
}
