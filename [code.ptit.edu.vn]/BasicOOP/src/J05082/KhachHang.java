package J05082;

import java.util.*;
import java.text.*;
public class KhachHang implements Comparable<KhachHang> {
    private String ma, hoten, gioiTinh, diaChi;
    private Date ns;
    private int ngay, thang, nam;
    public KhachHang(int i, String hoten, String gioiTinh, String ns, String diaChi) throws ParseException {
        this.ma = "KH" + String.format("%03d", i);
        this.hoten = chuanHoa(hoten);
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        xuly(ns);
    }
    
    public static String chuanHoa(String s) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            String tmp = st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++) {
                kq.append(Character.toLowerCase(tmp.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    
    public String toString(){
        return ma + " " + hoten + " " + gioiTinh + " " + diaChi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns);
    }
    private void xuly(String ns) {
        String day[] = ns.split("/");
        ngay = Integer.parseInt(day[0]);
        thang = Integer.parseInt(day[1]);
        nam = Integer.parseInt(day[2]);
    }
    public int compareTo(KhachHang o) {
        if(this.nam != o.nam) return (this.nam < o.nam) ? -1 : 1;
        else if (this.thang != o.thang) return (this.thang < o.thang) ? -1 : 1;
        else return (this.ngay < o.ngay) ? -1 : 1;
    }
}