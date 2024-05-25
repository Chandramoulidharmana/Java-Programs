import java.util.Scanner;
public class Main {
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
        System.out.println("enter array range:");
        int n=sc.nextInt();
        int[]arr=new int[n+1];
        System.out.println("enter your 1-based index array elements");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int[] pref=prefix(arr);
        // printArray(pref);
        System.out.println("enter the number of queries q:");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter the range:");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum=pref[r]-pref[l-1];

            System.out.println("sum:"+sum);
        }

        }
    }
