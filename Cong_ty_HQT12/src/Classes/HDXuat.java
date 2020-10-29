
package Classes;


public class HDXuat {
    private String maHDX;
    private String ngayXuat;
    private int slSPX;
    private DonVi dvn;
    private String manvString;
    private double congno;



    public HDXuat() {
    }

    public HDXuat(String maHDX, String ngayXuat, int slSPX, DonVi dvn, String manvString, double congno) {
        this.maHDX = maHDX;
        this.ngayXuat = ngayXuat;
        this.slSPX = slSPX;
        this.dvn = dvn;
        this.manvString = manvString;
        this.congno = congno;
    }

    public String getMaHDX() {
        return maHDX;
    }

    public void setMaHDX(String maHDX) {
        this.maHDX = maHDX;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public int getSlSPX() {
        return slSPX;
    }

    public void setSlSPX(int slSPX) {
        this.slSPX = slSPX;
    }

    public DonVi getDvn() {
        return dvn;
    }

    public void setDvn(DonVi dvn) {
        this.dvn = dvn;
    }

    public String getManvString() {
        return manvString;
    }

    public void setManvString(String manvString) {
        this.manvString = manvString;
    }

    public double getCongno() {
        return congno;
    }

    public void setCongno(double congno) {
        this.congno = congno;
    }
    
    
}
