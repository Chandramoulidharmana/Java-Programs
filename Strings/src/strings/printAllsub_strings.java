package strings;
import java.util.*;
public class printAllsub_strings {
    public static void main(String[] args) {
        String str="abcd"; // 0 t o 3
        for(int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(str.substring(i,j)+ " ");
            }

        }
        System.out.print(" ");


    }
}
