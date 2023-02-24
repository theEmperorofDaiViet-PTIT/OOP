import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ChuanHoaHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        while(in.hasNext()){
            String s = in.nextLine();
            if(s.equals("END"))
                break;
            System.out.println(chuanHoa(s));
        }
    }
    public static String chuanHoa(String str){
        str = str.toLowerCase();
            str = str.trim();
            str = str.replaceAll("\\s+", " ");
            String tmp[] = str.split(" ");
            str = "";
            for(int i = 0; i < tmp.length; i++){
                str += String.valueOf(tmp[i].charAt(0)).toUpperCase() + tmp[i].substring(1);
                if(i<tmp.length-1)
                    str += " ";
            }
            if(str.charAt(str.length()-1)==' ') str+="\b";
        return str;
    }
}