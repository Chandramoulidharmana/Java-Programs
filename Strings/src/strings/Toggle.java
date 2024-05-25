package strings;
import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String:");
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println(str);
        //toggle
        // PhYSicS = pHysICs
        for(int i=0;i<str.length();i++){
            // P->p
            //check alphabet -small ,capital
            //boolean flag=true; //true->capital
            char ch=str.charAt(i);
            if(ch==' ') continue;
            int asci=(int)ch;
            if(asci>=97 && asci<=122) {
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
            else if(asci>=65 && asci<=90){
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }



        }
        System.out.println("toggle String is:"+ str);
        System.out.println("hi");
    }
}
