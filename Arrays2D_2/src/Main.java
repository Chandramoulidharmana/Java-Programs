import java.util.Scanner;
public class Main {
    static int[][] Generate_spiral(int n){
        int[][] matrix=new int[n][n];
        int topRow=0,bottomRow=n-1,rightCol=n-1,leftCol=0;
        int curr=1;
        while(curr<= n*n) {
            // TopRow->leftCol to RightCol
            for (int j = leftCol; j <= rightCol && curr <= n * n; j++) {
                matrix[topRow][j] =curr++;
            }
            topRow++;
            // RightCol-> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && curr < n * n; i++) {
                matrix[i][rightCol] =curr++;
            }
            rightCol--;
            // bottomRow -> RightCol to leftCol
            for (int j = rightCol; j >= leftCol && curr < n * n; j--) {
                matrix[bottomRow][j]=curr++;
            }
            bottomRow--;
            // leftCol -> BottomRow to topRow
            for (int i = bottomRow; i >= topRow && curr < n * n; i--) {
                matrix[i][leftCol]=curr++;
            }
            leftCol++;
        }
        return matrix;
    }
    static void spiralOrder(int[][] arr,int r,int c){
        int topRow=0,bottomRow=r-1,rightCol=c-1,leftCol=0;
        int total_elements=0;
        while(total_elements< r*c){
            // TopRow->leftCol to RightCol
            for(int j=leftCol;j<=rightCol && total_elements<r*c ;j++){
                System.out.print(arr[topRow][j]+ " ");
                total_elements++;
            }
            topRow++;
            // RightCol-> topRow to bottomRow
            for(int i=topRow;i<=bottomRow && total_elements<r*c ;i++){
                System.out.print(arr[i][rightCol]+ " ");
                total_elements++;
            }
            rightCol--;
            // bottomRow -> RightCol to leftCol
            for(int j=rightCol;j>=leftCol && total_elements<r*c ;j--){
                System.out.print(arr[bottomRow][j]+" ");
                total_elements++;
            }
            bottomRow--;
            // leftCol -> BottomRow to topRow
            for(int i=bottomRow;i>=topRow && total_elements<r*c ;i--){
                System.out.println(arr[i][leftCol]+" ");
                total_elements++;
            }
            leftCol++;
        }
    }



    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int[][] matrix={{1,2,3},{2,3,4}};
       // System.out.println();
        System.out.println("enter your number of rows:");
        int r=sc.nextInt();
        System.out.println("enter your number of columns:");
        int c=sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("enter your elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("input Matrix:");
        printMatrix(arr);

        System.out.println("spiral order");
       spiralOrder(arr,r,c);
//       System.out.println("enter your number");
//        int n=sc.nextInt();
//        int[][]matrix=Generate_spiral(n);
//        printMatrix(matrix);
        }
    }

