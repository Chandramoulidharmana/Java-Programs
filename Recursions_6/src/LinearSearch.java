public class LinearSearch {

    // return all the indices which are equal to target
    static void findAllIndices(int []arr,int n,int x,int idx){
        // Base Case
        if(idx>=n)
            return ;
        // self work
        if(arr[idx] == x){
            System.out.println(idx);
        }

        // Recursive Work
        findAllIndices(arr,n,x,idx+1);
    }


    // return index of target if target present in the array,otherwise return -1
    static int findIndex(int []arr,int n,int x, int idx){
        // Base Case
        if(idx >= n)
            return -1;
        //Self Work
        if(arr[idx]==x)
            return idx;

        // Small problem
        return findIndex(arr,n,x,idx+1);
    }



    // return true if target present in the array otherwise false
    static boolean search(int []arr,int n,int x, int idx){
        // Base Case
        if(idx >= n)
            return false;
        //Self Work
        if(arr[idx]==x)
            return true;

        // Small problem
        return search(arr,n,x,idx+1);
    }



    public static void main(String[] args) {
        int[]arr={1,2,4,4,4,6,4};
        int target=4;

        findAllIndices(arr,arr.length,target,0);

       //  System.out.println(findIndex(arr,arr.length,target,0));
//        if(search(arr,arr.length,target,0)){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
    }
}
