import java.util.Scanner;
public class gcd {
    // using recursion
    static int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y,x%y);

    }
    // Iterative gcd
    static int I_gcd(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("x:");
        int x=sc.nextInt();
        System.out.println("y:");
        int y=sc.nextInt();
       System.out.println(I_gcd(x,y));
       System.out.println(gcd(x,y));
    }
}
