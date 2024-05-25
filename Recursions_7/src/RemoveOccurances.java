import java.util.Scanner;
public class RemoveOccurances {
    static String removeA(String s,int idx){
        //Base case
        if(idx == s.length())
            return "";

        // recursive work
        String smallans=removeA(s,idx+1);

        char currChar = s.charAt(idx);

        // Self Work
        if(currChar != 'a'){
            return currChar+smallans;
        }
        else{
            return smallans;
        }
    }
    static String removeA2(String s){
        if(s.length()==0) return "";
        // recursive work
        String smallans=removeA2(s.substring(1));
        char currChar=s.charAt(0);
        // Self work
        if(currChar != 'a'){
            return currChar+smallans;
        }
        else{
            return smallans;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        //System.out.println(removeA(s,0));
        System.out.println(removeA2(s));
    }
}
