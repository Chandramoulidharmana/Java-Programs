import java.util.ArrayList;
import java.util.Collections;
public class findAllIndices {
    /*
       arr -> 4,4,3,4
       target -> 4
       ans(arrayList) -> {0,1,3}

     */
    static ArrayList<Integer> allIndices(int []a,int n,int x,int idx){
        // Base Case
        if(idx>=n)
            return new ArrayList<Integer>(); // return empty array list

        // self work
        ArrayList<Integer> ans=new ArrayList<Integer>(); // ans-> {0}
        if(a[idx]==x){
            ans.add(idx);
        }

        // recursive work
        ArrayList<Integer>smallans=allIndices(a,n,x,idx+1);
        ans.addAll(smallans); //{0,1,3}

        return ans;

    }

    public static void main(String[] args) {
        int []a={1,2,4,4,5,4};
        int target=4;
        int n=a.length;
        ArrayList<Integer> ans=allIndices(a,n,target,0);
        for(Integer i:ans){
            System.out.println(i);
        }

    }
}
