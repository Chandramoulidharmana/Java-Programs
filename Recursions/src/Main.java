import java.util.Scanner;
public class Main {
    static void PrintDecreasing(int n){
        // Base Case
        if(n==1){
            System.out.println(n);
            return;
        }
        // Self Work   here we write it first because we have to print in Decrease Order
        System.out.println(n);
        // Small sub Problem
        PrintDecreasing(n-1);
    }
   static void PrintIncreasing(int n){
       if(n==1){
           System.out.println(n);
           return;
       }
       PrintIncreasing(n-1);
       System.out.println(n);
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your range");
        int n=sc.nextInt();
        //PrintIncreasing(n);
        PrintDecreasing(n);
        }
    }
