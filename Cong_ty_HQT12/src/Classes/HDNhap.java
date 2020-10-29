
package Classes;


public class HDNhap {
    private String maHDN;
    private String ngayN;
    private String maNV;
    private int slSPN;
    private DonVi dvn;

    public HDNhap() {
    }

    public HDNhap(String maHDN, String ngayN, String maNV, int slSPN, DonVi dvn) {
        this.maHDN = maHDN;
        this.ngayN = ngayN;
        this.maNV = maNV;
        this.slSPN = slSPN;
        this.dvn = dvn;
    }

    public String getMaHDN() {
        return maHDN;
    }

    public void setMaHDN(String maHDN) {
        this.maHDN = maHDN;
    }

    public String getNgayN() {
        return ngayN;
    }

    public void setNgayN(String ngayN) {
        this.ngayN = ngayN;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSlSPN() {
        return slSPN;
    }

    public void setSlSPN(int slSPN) {
        this.slSPN = slSPN;
    }

    public DonVi getDvn() {
        return dvn;
    }

    public void setDvn(DonVi dvn) {
        this.dvn = dvn;
    }

}
