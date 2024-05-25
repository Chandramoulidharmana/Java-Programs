import java.util.Scanner;
public class Series_Sum {
    static int series_sum(int n){
        if(n==0)
            return 0;
        if(n%2==0) {
            return series_sum(n - 1) - n;
        }
        else {
            return series_sum(n - 1) + n;
        }
    }
    static int series_sum1(int n){
        if(n==0)
            return 0;
        return series_sum1(n-1)+n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
       System.out.println(series_sum(n));

    }
}
