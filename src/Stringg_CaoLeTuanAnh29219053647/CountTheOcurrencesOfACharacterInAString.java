
package Stringg_CaoLeTuanAnh29219053647;
import java.lang.String;
import java.util.*;
public class CountTheOcurrencesOfACharacterInAString {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.print("Nhap phan tu can dem : ");
        char n =ch.next().charAt(0);
        int count = 0 ;
        String str = "Hello Word";
        for(int i  = 0 ;  i < str.length(); i++ ){
            if(str.charAt(i)==n){
                count ++;
            }
        }
        System.out.println("So lan xuat hien cua ki tu '"+n+"' la :" +count);
    }
}
