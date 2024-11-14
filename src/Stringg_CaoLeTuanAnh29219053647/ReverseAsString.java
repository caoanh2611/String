
package Stringg_CaoLeTuanAnh29219053647;
import java.lang.String;
import java.util.*;
public class ReverseAsString {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Nhap chuoi can dao : ");
        String st = str.nextLine();
        StringBuffer sb = new StringBuffer(st).reverse();
        System.out.println("Chuoi sau khi dao la : "+ sb);
    }
 
}
