package J05082;

import java.io.*;
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++) {
            KhachHang a = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(a);
        }
        Collections.sort(ds);
        for(KhachHang tmp : ds) {
            System.out.println(tmp);
        }
        sc.close();
    }
}