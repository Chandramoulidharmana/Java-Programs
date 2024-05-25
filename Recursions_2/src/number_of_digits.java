public class number_of_digits {
    static int nod(int n){
        // base case
        if(n>=0 && n<=9)
            return 1;
        //small problem
        int smallans=nod(n/10);

        // self work
        int ans=smallans+1;
        // ans=smallans+nod(n%10);
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(nod(56837));
    }
}
