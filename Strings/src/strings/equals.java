package strings;
import java.util.*;
public class equals {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        System.out.println(s1==s2); // print true because addresses same due to interning
        System.out.println(s1==s3); // print false because of addresses not same
        System.out.println(s1.equals(s2)); // print true addresses and strings are same
        System.out.println(s1.equals(s3)); // equals() first check addresses and after that it check String characters
    }
}
