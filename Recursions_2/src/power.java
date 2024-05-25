public class power {
    static int Pow(int p,int q){
        // base case
        if(q==0)
            return 1;
//        //small problem
//        int subans=Pow(p,q-1);
//        //self work
//        int ans=subans*p;
//        return ans;
        return Pow(p,q-1)*p;

    }

    public static void main(String[] args) {
        System.out.println(Pow(5,4));
    }
}
