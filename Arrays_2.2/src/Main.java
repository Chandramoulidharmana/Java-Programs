import java.util.Arrays;
import java.util.Scanner;
class Pairsum {
    static int find_min(int []arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    static int second_smallest(int []arr){
        int n=arr.length;
       int mn= find_min(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==mn){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int second_min=find_min(arr);
        return second_min;
    }
    static int last_repeat(int []arr) {
        int n = arr.length;
        for (int i = n-1; i >=0; i--) {
            for (int j = (n-1)-1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static int first_repeat(int [] arr){
       int  n=arr.length;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(arr[i]==arr[j]){
                   return arr[i];
               }
           }
       }
       return -1;

    }

    static int find_max(int[]arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
        static int second_max(int []arr){
            int n = arr.length;
            int mx=find_max(arr);
            for(int i=0;i<n;i++){
                if(arr[i]==mx){
                    arr[i]=Integer.MIN_VALUE;
                }
            }
            int secondmax = find_max(arr);
            return secondmax;
        }


    static int unique_number(int[]arr){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }

            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] >0){
                ans=arr[i];


            }
        }
        return ans;
    }
    static int triple_sum(int[]arr,int target){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count+=1;
                    }
                }
            }
        }
        return count;
    }
    static int pairsum(int []arr,int target){
        int count=0;
       int n=arr.length;
        for(int i=0;i<n;i++){  //first number
            for(int j=i+1;j<n;j++){  //second number
                if(arr[i]+arr[j]==target){
                    count+=1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter your"+n+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
       // System.out.println("enter your target number");
        //int target=sc.nextInt();
       // System.out.println("the number pair sums is:"+pairsum(arr,target));
       // System.out.println("the number of triple sums is:"+triple_sum(arr,target));
       // System.out.println(unique_number(arr)+" is the unique number in array");
        //System.out.println(second_max(arr)+" is the second largest element in array");
      //  System.out.println(first_repeat(arr)+" is the first repeated element in array");
        System.out.println(last_repeat(arr)+" is the last repeated in array");
        //System.out.println(second_smallest(arr)+" is the second minimum in array");


        }
    }
