import java.util.Scanner;
public class Main {
    static void suffix_sum(int[]arr){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i]+arr[i+1];
        }

    }
    static int Total_sum(int []arr){
        int n=arr.length;
       int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean equal_sum_part(int []arr){
        int total_sum=Total_sum(arr);

        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
           int suffSum = total_sum-prefSum;
           if(prefSum==suffSum){
               return true;
           }
        }
        return false;
    }
    static void printArray(int[] ans) {
        System.out.println("Answer Array is:");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");

        }
    }


    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the range of array");
           int n=sc.nextInt();
           System.out.println("enter your array elements");
           int[] arr=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
         System.out.println(equal_sum_part(arr));
       // suffix_sum(arr);
           printArray(arr);


        }
    }
