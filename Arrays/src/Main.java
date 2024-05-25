import java.util.Scanner;
class Arraysexample{
    void multiArrays(){
      //  int [][] arr_1=new int[5][3];
    int[][]arr={{10,20,30},{40,50,60},{70,80,90}};

   /* System.out.println(arr[0][1]);//20
    System.out.println(arr[1][2]);//60
    System.out.println(arr[2][0]);//70*/

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.println(arr[i][j]);
            }
        }

    }
    void demoArrays(){
        int[] ages=new int[3];
        String [] names=new String[4];
        float[] weights=new float[4];

        System.out.println(ages[0]=10);
        System.out.println(ages[1]=20);

       // System.out.println(names[0]="mouli");
        //System.out.println(names[1]="raj");
        //System.out.println(names[2]="ram");

        System.out.println(weights[0]= 20.5f);
        System.out.println(weights[1]= 29.8f);
        System.out.println(weights[2]= 45.7f);

   /*     System.out.println(ages.length);
        System.out.println(names.length);
        System.out.println(weights.length);*/

        //for(int i=0;i<=2;i++){
       //     System.out.println(ages[i]);
      //  }
        for(float weight:weights){   //for each loop
            System.out.println(weight);
        }

        int i=0;
        while(i<=2){
            System.out.println(ages[i]);
            i++;
        }



    }

}
class sum_of_array{
    void sum_of(){
        int [] arr={1,4,5,6,7,8};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        System.out.println("sum of the array elements is"+sum);
    }

}
class max_of_array{

    void max(){
        int [] arr={10,5,3,50,20,60,90,23,100,20};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum element is"+max);
    }

}

class find_element{
    void find(){
        int arr[]={1,2,5,6,7,8,3,10,20};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to found:");
        int n=sc.nextInt();
        int ans= -1;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==n){
                ans= i;
            }
        }
        if(ans==-1){
            System.out.println("Element not found");
            return;
        }
        else{
            System.out.println("Element found at"+ans);
            return;
        }

    }

}




public class Main {
    public static void main(String[] args) {
        Arraysexample obj=new Arraysexample();
       // obj.demoArrays();
       // obj.multiArrays();
       // sum_of_array obj1=new sum_of_array();
       // obj1.sum_of();
        //max_of_array obj2=new max_of_array();
        //obj2.max();
        find_element obj3=new find_element();
        obj3.find();

    }
}