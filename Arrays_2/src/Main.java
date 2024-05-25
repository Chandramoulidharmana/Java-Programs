import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static void print_array(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println( );

    }
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
       // int n = sc.nextInt();
        int[] arr = new int[4];
        arr[0]=1;
        arr[1]=3;
        arr[2]=5;
        arr[3]=7;
        //System.out.println("enter the array elements");
       // for (int i = 0; i < arr.length; i++) {
           // arr[i] = sc.nextInt();
        //}
      //  for (int i = 0; i < n; i++) {
        //System.out.print(+arr[i] + ":" + " ");
        System.out.println("Original array:");
        print_array(arr);
       // }
        //trying to copy arr to arr_2;
        int[] arr_2 = arr; //in this case when we change copied array then original array also changed
        //int []arr_2=arr.clone(); //original array not changed
        //int []arr_2=Arrays.copyOf(arr,arr.length);  //same as clone but we can mention index
       // for (int i = 0; i < n; i++) {
        //    System.out.print(+arr_2[i] + ":" + " ");
        System.out.println("copied array");
        print_array(arr_2);
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original array after changing");
        print_array(arr);
        System.out.println("copied array after changing");
        print_array(arr_2);


        }

    }

