public class Main {
    static void bubble_sort(int[]arr){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                /* last i elements already at correct sorted positions
                No need to Sort them  */
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={-1,-34,-90,4,1,6};
        bubble_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}