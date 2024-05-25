public class Recursion_Array {

    static int sum_array(int[]arr,int idx){
        // Base Case
        if(idx==arr.length-1)
            return arr[idx];
        if(idx==arr.length)
            return 0;
        // Small Problem
        int smallans=sum_array(arr,idx+1);

        // Self Work
        return smallans+arr[idx];

    }

    static int maxInArray(int [] arr,int idx){
        // base case
        if(idx==arr.length-1)
            return arr[idx];
        // Small problem->idx+1,end of the array->max->return
        int smallans=maxInArray(arr,idx+1);

        // self work
        return Math.max(arr[idx],smallans);
    }
    static void printArray(int [] arr,int idx){
         // base case
        if(idx == arr.length)
            return;
        // Self Work
        System.out.println(arr[idx]);

        // Sub Problem
        printArray(arr,idx+1);

    }
    public static void main(String[] args) {
        int [] arr={5,6,10,7,8,2};
        //printArray(arr,0);
        //System.out.println(maxInArray(arr,0));
        System.out.println(sum_array(arr,0));

    }
}
