package CustomTable;

import Classes.Kho;
import Classes.SanPham;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CustomTable_kho extends AbstractTableModel {

    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[] = {"Mã sản phẩm", "Tên sản phẩm", "Màu sắc", "Thông số kỹ thuật", "Số lượng tồn", "Tình trạng", "SoNgayTon", "Cách xử lý", "Số lượng xử lý", "chiết khấu"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, String.class, String.class, String.class, Integer.class, String.class, Integer.class, String.class, Integer.class, Integer.class};
    //Tạo một đối tượng arrayList có tên hàng nhập.
    ArrayList<Kho> listSPT = new ArrayList<Kho>();

    //phương thức khởi tạo cho class có tham số truyền vào.
    public CustomTable_kho(ArrayList<Kho> listhoadonhap) {
        this.listSPT = listhoadonhap;
    }

    //lấy số phần tử của listThiSinh
    @Override
    public int getRowCount() {
        return listSPT.size();
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
                return listSPT.get(rowIndex).getMaSP();
            //Cột đơn vị nhập
            case 1:
                return listSPT.get(rowIndex).getTenSP();
            //cột sản phẩm
            case 2:
                return listSPT.get(rowIndex).getMauSac();
            //cột nhân viên
            case 3:
                return listSPT.get(rowIndex).getThongso();
            //cột số lượng 
            case 4:
                return listSPT.get(rowIndex).getSoLuong();
            case 5:
                return listSPT.get(rowIndex).getTinhTrang();
            //Cột đơn vị nhập
            case 6:
                return listSPT.get(rowIndex).getSoNgayton();
            //cột sản phẩm
            case 7:
                return listSPT.get(rowIndex).getCachXuLy();
            //cột nhân viên
            case 8:
                return listSPT.get(rowIndex).getSlXuLy();
            //cột số lượng 
            case 9:
                return listSPT.get(rowIndex).getPtGiamGia()+"%";
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
}
