
package Stringg_CaoLeTuanAnh29219053647;
import java.lang.String;
import java.util.*;

public class FindTheLongestWordInAString {
        public static void main(String[] args) {
          Scanner str = new Scanner(System.in);
        System.out.print("Nhap chuoi :");
        String st = str.nextLine();
        String[] words = st.split(" "); 
        String max = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max.length()) { 
                 max=words[i];
            }
        }
        System.out.println("So lan tu trong chuoi la: " + max);
    }
}
  

