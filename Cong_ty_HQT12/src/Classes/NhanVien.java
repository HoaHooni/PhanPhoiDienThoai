
package Classes;


public class NhanVien {
    private String tk;
    private String mk;

    public NhanVien(String tk, String mk) {
        this.tk = tk;
        this.mk = mk;
    }

    public NhanVien(String tk) {
        this.tk = tk;
    }

    public NhanVien() {
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }
    
    
}
