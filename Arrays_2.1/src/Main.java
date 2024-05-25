import java.util.Arrays;
import java.util.Scanner;
 class frequency {
     static int[] Kth_smallest_largest(int[]arr,int x){
         Arrays.sort(arr);
         int[]ans ={arr[x-1],arr[(arr.length)-x]};
         return ans;

     }


     static int[] smallest_and_largest(int []arr){
         Arrays.sort(arr);
         int[]ans={arr[0],arr[arr.length-1]};
         return ans;


     }

     static boolean isSorted(int []arr){
         boolean check=true;
         for(int i=1;i<arr.length;i++){
             if(arr[i]<arr[i-1]){
                 check=false;
                 break;
             }
         }
         return check;
     }
     static int greater_than_x(int []arr,int x){
         int count=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]>x){
                 count+=1;
             }
         }
         return count;
     }
     static int last_Occurence(int []arr,int x){
         int last_index=-1;
         for(int i=0;i<arr.length;i++){
             if(arr[i]==x){
                 last_index=i;
             }
         }
         return last_index;
     }
     static int Occurence(int[] arr, int x) {

         int count = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == x) {
                 count += 1;
             }
         }
         return count;


     }

         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("enter number of elements");
             int n = sc.nextInt();
             int arr[] = new int[n];
             System.out.println("enter array elements");
             for (int i = 0; i < n; i++) {
                 arr[i] = sc.nextInt();
             }
             for (int i = 0; i < n; i++) {
                 System.out.println(arr[i] + " ");
             }
             System.out.println("enter the value of x");
             int x = sc.nextInt();

            // System.out.println(x + "is" + Occurence(arr, x) + "times occured in array");
             System.out.println(x + "is last occured in index" +last_Occurence(arr,x));
            // System.out.println(greater_than_x(arr,x)+"elements are greater than"+x +"in array");
            // System.out.println(isSorted(arr));
            /* int []ans=smallest_and_largest(arr);
             System.out.println("smallest element array is:"+ans[0]);
             System.out.println("largest element is:"+ans[1]);*/
//             int[]ans=Kth_smallest_largest(arr,x);
//             System.out.println(x+"th smallest element is: "+ans[0]);
//             System.out.println(x+"th largest element is:"+ans[1]);


         }
     }



