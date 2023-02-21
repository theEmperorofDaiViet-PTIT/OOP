package J05066b;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++) {
            NhanVien a = new NhanVien(sc.next(), sc.nextLine());
            if(a.getRank().equals("GD")) {
                if(a.getID() > 1) a.setRank();
            }
            if(a.getRank().equals("TP")) {
                if(a.getID() > 3) a.setRank();
            }
            if(a.getRank().equals("PP")) {
                if(a.getID() > 3) a.setRank();
            }
            ds.add(a);
        }
        Collections.sort(ds);
        int m = Integer.parseInt(sc.nextLine());;
        for(int i = 1; i <= m; i++) {
            String s = sc.nextLine();
            for(NhanVien tmp : ds) {
                if(tmp.getName().toLowerCase().contains(s.toLowerCase())) System.out.println(tmp);
            }
            System.out.println();
        }
        sc.close();
    }
}