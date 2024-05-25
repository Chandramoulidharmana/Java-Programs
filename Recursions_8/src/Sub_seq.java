import java.util.ArrayList;
import java.util.Collections;
public class Sub_seq {
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans=new ArrayList<>();
        // base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }

        char curr=s.charAt(0);
        ArrayList<String> smallans=getSSQ(s.substring(1)); // ["bc","b","c",""]
        //smallAns=["bc","b","c",""]
        //ans=["bc", "abc", "b", "ab", "c", "ac", "", "a"]
        for(String ss:smallans){
            ans.add(ss);
            ans.add(curr+ss);
        }
       return ans;
    }
    public static void main(String[] args) {
        String s="abc";
        ArrayList<String>ans=getSSQ(s);
        for(String ss:ans){
            System.out.println(ss);
        }


    }
}
