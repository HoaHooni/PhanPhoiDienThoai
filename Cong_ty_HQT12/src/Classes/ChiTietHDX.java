package Classes;

import java.util.ArrayList;

public class ChiTietHDX {

    private HDXuat hdx;
    private ArrayList<SanPham> listSP;

    public ChiTietHDX() {
    }

    public ChiTietHDX(HDXuat hdx, ArrayList<SanPham> listSP) {
        this.hdx = hdx;
        this.listSP = listSP;
    }    

    public HDXuat getHdx() {
        return hdx;
    }

    public void setHdx(HDXuat hdx) {
        this.hdx = hdx;
    }

    public ArrayList<SanPham> getListSP() {
        return listSP;
    }

    public void setListSP(ArrayList<SanPham> listSP) {
        this.listSP = listSP;
    }
    
}
