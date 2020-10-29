
package Classes;


public class DonVi {
    private String maDV;
    private String tenDV;
    private String diachi;
    private String sdt;
    private String email;

    public DonVi() {
    }

    public DonVi(String maDV, String tenDV, String diachi, String sdt, String email) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
