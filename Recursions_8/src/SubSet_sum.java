public class SubSet_sum {

    static void subsetSum(int[]a,int n,int idx,int sum){
        // base case
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        // curr idx + sum
        subsetSum(a,n,idx+1,sum+a[idx]); // include
        // Sum
        subsetSum(a,n,idx+1,sum); // exclude
    }
    public static void main(String[] args) {
        int[] a={2,4,5};
        subsetSum(a,a.length,0,0);
    }
}
