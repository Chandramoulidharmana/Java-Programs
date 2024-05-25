import java.util.Scanner;
public class Main {
    static int[] sort_squares(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int ans[] = new int[n];
        int k = 0;
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k++] = arr[i] *arr[i];
                i++;
            } else {
                ans[k++] = arr[j] * arr[j];
                j--;
            }

        }
        return ans;
    }

    static void even_odd_swap(int [] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i < j){
            if(arr[i]%2==1 && arr[j]%2==0){
                swap_in_arr(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2==1){
                j--;
            }
        }
    }

    static int [] even_odd(int []arr){
        int n= arr.length;
        int [] ans= new int[n];
        int j=0;
        for(int i=0;i<n;i++) {
            if (arr[i] % 2 == 0) {
                ans[j] = arr[i];
                j++;
            }
        }
            for(int i=0;i<n;i++){
                if(arr[i]%2==1){
                    ans[j]=arr[i];
                    j++;
                }
            }

        return ans;

    }
    static void sort_0s_1s_swap(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while(i < j) {
            if(arr[i]==1 && arr[j]==0) {
                swap_in_arr(arr, i, j);

                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
    }


    static void sort_0s_1s(int [] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count+=1;
            }
        }
        for(int i=0;i<n;i++){
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    static void reverse_arr_swap(int[]arr,int i,int j){
        //   int i=0,j=arr.length-1;
        while(i<j){
            swap_in_arr(arr,i,j);
            i++;
            j--;
        }

    }
    static void printArray(int[] arr) {
       // System.out.println("reversed Array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }
    static void swap_in_arr(int[]arr,int i,int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range of array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter your elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // sort_0s_1s(arr);
       // sort_0s_1s_swap(arr);
       // int[] ans=even_odd(arr);
       // even_odd_swap(arr);
        int []ans=sort_squares(arr);
        reverse_arr_swap(ans,0,n-1);
        printArray(ans);

        }
    }
