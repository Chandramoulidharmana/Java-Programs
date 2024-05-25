package strings;
import java.util.*;
public class str_Builder {
    public static void main(String[] args) {
       /* StringBuilder str= new StringBuilder("hello");
        System.out.println(str); //hello
        str.setCharAt(0,'m'); //setCharAt()
        System.out.println(str); // mello
        str.append(10);
        System.out.println(str); // mello10
        str.insert(2,'y');// insert
        System.out.println(str); // meyllo10
        str.deleteCharAt(0);//deleteCharAt()
        System.out.println(str);*/
        StringBuilder sb =new StringBuilder("physics");
        sb.reverse();
        System.out.println(sb); //scisyhp
        sb.delete(2,4); // 2 to 3 deleted
        System.out.println(sb);






    }

}
