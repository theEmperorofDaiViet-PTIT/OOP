package Quanlibaitapnhom;

public class SinhVien implements Comparable<SinhVien>{
    private String msv, ten, sdt, nhom, btl;
    public SinhVien(String msv, String ten, String sdt) {
        this.msv = msv;
        this.ten = ten;
        this.sdt = sdt;
    }
    public String toString() {
        return msv + " " + ten + " " + sdt + " " + nhom + " " + btl;
    }
    public String getMSV() {
        return msv;
    }
    public void setNhom(String s) {
        this.nhom = s;
    }
    public int getNhom() {
        return Integer.parseInt(nhom);
    }
    public void setBTL(String s) {
        this.btl = s;
    }
    public int compareTo(SinhVien o) {
        return this.msv.compareTo(o.msv) > 0 ? 1 : -1;
    }
}