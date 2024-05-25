import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class reverse_string {
    static String reverse(String s,int idx){
        // base case
        if(idx==s.length())
            return " ";
        // Recursive Work
        String smallans=reverse(s,idx+1);
        return smallans+s.charAt(idx);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String:");
        String s=sc.nextLine();
      //  System.out.println(reverse(s,0));
        String rev=reverse(s,0);
        System.out.println(rev);
        if (rev.equals(s)) {
            System.out.printf("%s Palindrome", s);
        }
        else{
            System.out.printf("%s Not Palindrome",s);
        }
    }
}
