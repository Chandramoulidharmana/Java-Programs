
public class Main {
    static void merge(int[]arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[]left=new int[n1];
        int[]right=new int[n2];
        for(int i=0;i<n1;i++) left[i]=arr[l+i];
        for(int j=0;j<n2;j++) right[j]=arr[mid+1+j];
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    static void merge_sort(int[]arr,int l,int r){
        // base case
        if(l>=r) return;
        int mid=(l+r)/2;
        merge_sort(arr,l,mid);
        merge_sort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static void display(int[]arr){
        for(int val:arr){
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,2,7,0,9,6};
        System.out.println("array before Sorting");
        display(arr);
        System.out.println("array after sorting");
        merge_sort(arr,0,arr.length-1);
        display(arr);


    }
}