public class IsSorted {

    static boolean isSorted(int[]arr,int n) {
        // base case
        if (n==1 || n==0)
            return true;
        // self work
         return arr[n-1] >= arr[n-2] && isSorted(arr,n-1);



    }
    public static void main(String[] args) {
        int []arr={1,2,4,3,5};
        int n=arr.length;
        if(isSorted(arr,n)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("not Sorted");
        }
    }
}
