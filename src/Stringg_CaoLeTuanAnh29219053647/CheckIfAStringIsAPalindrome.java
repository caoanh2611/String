
package Stringg_CaoLeTuanAnh29219053647;
import java.lang.String;
import java.util.*;
public class CheckIfAStringIsAPalindrome {
     public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Nhap chuoi :  ");
        String st = str.nextLine();
      String restr = new StringBuffer(st).reverse().toString();
    if(st.equalsIgnoreCase(restr)){
     System.out.println(st + " la mot Palindrome !");
 }else{
      System.out.println(st + " khong phai la mot Palindrome !");
 }
        
}
}
