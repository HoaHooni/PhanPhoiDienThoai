
package Classes;

public class Kho {
    
    private String maSP;
    private String tenSP;
    private String mauSac;
    private String thongso;
    private int soLuong;
    private String tinhTrang;
    private int soNgayton;
    private String cachXuLy;
    private int slXuLy;
    private int ptGiamGia;

    public Kho() {
    }

    public Kho(String maSP, String tenSP, String mauSac, String thongso, int soLuong, String tinhTrang, int soNgayton, String cachXuLy, int slXuLy, int ptGiamGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.mauSac = mauSac;
        this.thongso = thongso;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
        this.soNgayton = soNgayton;
        this.cachXuLy = cachXuLy;
        this.slXuLy = slXuLy;
        this.ptGiamGia = ptGiamGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getThongso() {
        return thongso;
    }

    public void setThongso(String thongso) {
        this.thongso = thongso;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSoNgayton() {
        return soNgayton;
    }

    public void setSoNgayton(int soNgayton) {
        this.soNgayton = soNgayton;
    }

    public String getCachXuLy() {
        return cachXuLy;
    }

    public void setCachXuLy(String cachXuLy) {
        this.cachXuLy = cachXuLy;
    }

    public int getSlXuLy() {
        return slXuLy;
    }

    public void setSlXuLy(int slXuLy) {
        this.slXuLy = slXuLy;
    }

    public int getPtGiamGia() {
        return ptGiamGia;
    }

    public void setPtGiamGia(int ptGiamGia) {
        this.ptGiamGia = ptGiamGia;
    }
}
