
public class Main {
    static void selection_sort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){ // For the number of passes
            int min_index=i;
            // Find the minimum element in the array
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            //swap the current element and minimum element
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;

        }
    }

    public static void main(String[] args) {
        int[]arr={2,4,1,5,3,6,0};
        selection_sort(arr);
        for(int i:arr){
            System.out.println(i + " ");
        }

    }
}