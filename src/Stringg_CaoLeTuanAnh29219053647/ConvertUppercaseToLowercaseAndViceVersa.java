
package Stringg_CaoLeTuanAnh29219053647;
import java.lang.String;
import java.util.*;

public class ConvertUppercaseToLowercaseAndViceVersa {
    public static void main(String[] args) {
       Scanner str = new Scanner(System.in);
        System.out.print("Nhap chuoi :  "); 
          String st = str.nextLine();
           StringBuilder result = new StringBuilder();
          for(int i  =  0  ;  i < st.length() ; i ++){
              char ch = st.charAt(i);
             if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else{
                result.append(ch);
            }
        }

        System.out.println("Chuoi sau khi doi: " + result.toString());
    }
}
