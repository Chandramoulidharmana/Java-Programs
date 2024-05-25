import java.util.Scanner;
public class Main {
    static int[] make_fequency_array(int []arr){
        int [] freq =new int[100005];
        for(int i=0; i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }



    static void rotate_in_place(int []arr,int k){
      int n=arr.length;
      k=k%n;
      reverse_arr_swap(arr,0,n-k-1);
      reverse_arr_swap(arr,n-k,n-1);
      reverse_arr_swap(arr,0,n-1);
    }

    static int[] rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j]=arr[i];
            j++;
        }
        for(int i=0;i<n-k;i++){
            ans[j]=arr[i];
            j++;
        }
        return ans;

    }

    static void swap_in_arr(int[]arr,int i,int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverse_arr_swap(int[]arr,int i,int j){
     //   int i=0,j=arr.length-1;
        while(i<j){
            swap_in_arr(arr,i,j);
            i++;
            j--;
        }

    }

    static int[] reverse_array(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[j] = arr[i];//here we can also write ans[j++]=arr[i];
            j++;
        }
        return ans;
    }

    static void printArray(int[] ans) {
        System.out.println("reversed Array is:");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");

        }
    }
        static void without_temp ( int a, int b){
            System.out.println("Original values of a and b is");
            System.out.println("a:" + a);
            System.out.println("b:" + b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("values after swap");
            System.out.println("a:" + a);
            System.out.println("b:" + b);
        }
        static void swap ( int a, int b){
            System.out.println("Original values of a and b is");
            System.out.println("a:" + a);
            System.out.println("b:" + b);
            int temp = a;
            a = b;
            b = temp;
            System.out.println("values after swap");
            System.out.println("a:" + a);
            System.out.println("b:" + b);
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
          /*  System.out.println("enter the value of a:");
            int a = sc.nextInt();
            System.out.println("enter the value of b:");
            int b = sc.nextInt();*/
            System.out.println("enter the range of array");
            int n = sc.nextInt();
            int [] arr = new int[n];
            System.out.println("enter the elements in array");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter the value of k:");
            int k=sc.nextInt();
            //swap(a,b);
            // without_temp(a,b);
         //    int[] ans = reverse_array(arr);

           // reverse_arr_swap(arr);
           // printArray(arr);
          // int[]ans= rotate(arr,k);
           // printArray(ans);
            rotate_in_place(arr,k);
            printArray(arr);
//            int freq[]=make_fequency_array(arr);
//            System.out.println("enter number of queries");
//            int q=sc.nextInt();
//            while(q>0){
//                System.out.println("enter number to search x:");
//                int x =sc.nextInt();
//                if(freq[x]>0){
//                    System.out.println("yes");
//                }
//                else{
//                    System.out.println("No");
//                }
//                q--;
//            }



        }
    }

