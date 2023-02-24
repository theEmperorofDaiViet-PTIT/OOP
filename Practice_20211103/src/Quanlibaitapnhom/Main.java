package Quanlibaitapnhom;

import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        Scanner sc3 = new Scanner(new File("NHOM.in"));
        ArrayList<SinhVien> ds1 = new ArrayList<>();
        int m = Integer.parseInt(sc1.nextLine());
        for(int i = 1; i <= m; i++) {
            SinhVien a = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            ds1.add(a);
        }
        
        int n = Integer.parseInt(sc2.nextLine());
        String nhom[] = new String[n+1];
        for(int i = 1; i <= n; i++) {
            nhom[i] = sc2.nextLine();
        }
        
        ArrayList<Nhom> ds3 = new ArrayList<>();
        while(sc3.hasNextLine()) {
            String tmp[] = sc3.nextLine().split("\\s+");
            Nhom a = new Nhom(tmp[0], tmp[1]);
            ds3.add(a);
        }
        for(SinhVien tmp1 : ds1) {
            for(Nhom tmp3 : ds3) {
                if(tmp1.getMSV().equals(tmp3.getMSV())) {
                    tmp1.setNhom(tmp3.getNhom());
                    tmp1.setBTL(nhom[tmp1.getNhom()]); 
                }
            }
        }
        Collections.sort(ds1);
        for(SinhVien tmp1 : ds1) {
            System.out.println(tmp1);
        }
    }
}