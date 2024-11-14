
package Stringg_CaoLeTuanAnh29219053647;
import java.lang.String;
import java.util.*;
public class Removeextraspacesinastring {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Nhap chuoi  : ");
        String st = str.nextLine();
        String result = st.trim().replaceAll("\\s+", " ");
        System.out.println("Chuoi sau khi xoa khoang trang la : "+result );
    } 
}
