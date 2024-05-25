import java.util.Scanner;
public class Main {
    static int[][] pascal(int n){
        int [][] ans=new int[n][];
        for(int i=0;i<n;i++){
            // ith row has i+1 columns
            ans[i]=new int[i+1];
            // 1st column and last column is 1
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    static void rotate_90(int [][]arr,int r,int c) {
        transpose_swap(arr, r, c);
        reverse_rows(arr,r,c);
    }

    static void transpose_swap(int [][]arr,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void Transpose_matrix(int [][]arr,int r,int c){
        int ans[][]=new int[c][r];
        for(int i=0;i<c;i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j]=arr[j][i];

            }
        }
        System.out.println("transpose of matrix:");
        printMatrix(ans);
    }

    static void reverse_rows(int[][]arr,int r,int c){
        int ans[][]=new int[r][c];
        for(int i=0;i<r;i++){
            ans[i]=reverse_array(arr[i]);
        }
        printMatrix(ans);
    }

    static void mul_matrix(int [][]a,int r,int c,int[][]b,int r1,int c1) {
        if (c != r1) {
            System.out.println("multiplication not possible");
            return;
        }
        int[][] mul = new int[r][c1];
        for (int i = 0; i < r; i++) {  //for rows
            for (int j = 0; j < c1; j++) { //for columns
                for (int k = 0; k < c; k++) {
                    // a matrix rows*b matrix columns
                    mul[i][j] += a[i][k] * b[k][j];


                }
            }
        }
        System.out.println("Multiplication of two matrices is:");
        printMatrix(mul);
    }

    static void Matrix_sum(int[][]a,int r,int c,int[][] b,int r1,int c1){
        if(r!=r1 || c!=c1){
            System.out.println("Wrong input:Addition not possible");
            return;
        }
        int[][] sum=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printMatrix(sum);

    }
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    static int[] reverse_array(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[j] = arr[i];//here we can also write ans[j++]=arr[i];
            j++;
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* System.out.println("enter number of rows");
        int r=sc.nextInt();
        System.out.println("enter number of columns");
        int c=sc.nextInt();
        System.out.println("enter your"+ r*c+ " elements");
        int [][]arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }*/
        //printMatrix(arr);
       /* System.out.println("enter number of rows of matrix 1");
        int r = sc.nextInt();
        System.out.println("enter number of columns of matrix 1");
        int c = sc.nextInt();
        System.out.println("enter your" + r * c + " elements");
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }


        }
        System.out.println("enter number of rows of matrix 2");
        int r1 = sc.nextInt();
        System.out.println("enter number of columns of matrix 2");
        int c1 = sc.nextInt();
        System.out.println("enter your" + r * c + " elements");
        int[][] b = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                b[i][j] = sc.nextInt();
            }


        }*/
      //  Matrix_sum(a,r,c,b,r1,c1);
       // mul_matrix(a,r,c,b,r1,c1);
      //  reverse_rows(arr,r,c);
       // Transpose_matrix(arr,r,c);
       // transpose_swap(arr,r,c);
       // rotate_90(arr,r,c);
        System.out.println("enter the number of rows:");
        int n=sc.nextInt();
       int ans[][]= pascal(n);
       printMatrix(ans);

    }
}
