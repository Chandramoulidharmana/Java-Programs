import java.util.Scanner;
public class Main {
    static int queries_L_R_sum(int[]arr1,int l,int r){
        //int n=arr1.length;
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr1[i];
        }
        return sum;

    }

    static void prefix_sum_without_new_arr(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }
    static int[]prefix(int[]arr){
        int n=arr.length;
        int []pref=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
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
        //int[] arr=new int[n];
        /*  System.out.println("enter your elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }*/
        int[]arr1=new int[n+1];
        System.out.println("enter your 1-based index array elements");
        for(int i=1;i<=n;i++){
            arr1[i]=sc.nextInt();
        }
       // int[] pref=prefix(arr);
       // printArray(pref);
       // prefix_sum_without_new_arr(arr);
       // printArray(arr);
        System.out.println("enter number of queries");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter your range");
            int l=sc.nextInt();
            int r=sc.nextInt();
           System.out.println("sum:"+queries_L_R_sum(arr1,l,r));
            q--;
        }

        }
    }
