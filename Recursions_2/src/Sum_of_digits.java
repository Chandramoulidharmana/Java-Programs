public class Sum_of_digits {
    static int sod(int n){
        //base case
        if(n>=0 && n<=9)
            return n;
//        //Small problem
//        int smallans=sod(n/10);
//        //self work
//        int ans=smallans+(n%10);
//        return ans;
        return sod(n/10)+(n%10);
    }

    public static void main(String[] args) {
        System.out.println(sod(1234));
    }
}