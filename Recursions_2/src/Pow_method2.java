public class Pow_method2 {
    static int pow(int p,int q){
        if(q==0)
            return 1;
       int  smallans=pow(p,q/2);
        if (q % 2 == 0) { //even
            return smallans*smallans;
        }
        return smallans*smallans*p;
    }

    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }
}
