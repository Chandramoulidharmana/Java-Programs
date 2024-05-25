import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class k_multiples {
   static void multiple(int n,int k){
        if(k==1) {
            System.out.println(n);
            return;
        }

        //sub problem
        multiple(n,k-1);

        //self work
      System.out.println( n*k);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        multiple(n,k);
    }
}
