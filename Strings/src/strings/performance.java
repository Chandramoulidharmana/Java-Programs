package strings;
import java.util.*;
public class performance {
    public static void main(String[] args) {
        String str= "";
        for(int i=1;i<=10;i++){
            str=str+i;
        }
        System.out.println(str);  //it have to print like 1 12 13....10
    }                              //but it prints like 12345...10 so the performance of stringsis low
}
