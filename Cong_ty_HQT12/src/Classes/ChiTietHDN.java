
package Classes;

import java.util.ArrayList;


public class ChiTietHDN {

    private HDNhap hdn;
    private ArrayList<SanPham> listSP;

    public ChiTietHDN() {
    }

    public ChiTietHDN(HDNhap hdn, ArrayList<SanPham> listSPN) {
        this.hdn = hdn;
        this.listSP = listSPN;
    }

    public HDNhap getHdn() {
        return hdn;
    }

    public void setHdn(HDNhap hdn) {
        this.hdn = hdn;
    }

    public ArrayList<SanPham> getListSP() {
        return listSP;
    }

    public void setListSP(ArrayList<SanPham> listSP) {
        this.listSP = listSP;
    }

    
    
}
