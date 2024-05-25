
public class Main {
    static void insertion_sort(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){ // for number of passes and 0 index is sorted
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){ // sorting by swapping
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,4,2,0,8,6,3};
        insertion_sort(arr);
        for(int i:arr){
            System.out.println(" "+i);
        }

    }
}