import java.util.Scanner;
class Algebra{
    int a;
    int b;
    Algebra(int x,int y){
        System.out.println("constructor called");
        a=x;
        b=y;
    }

     //int add(int a,int b){
    int add(){
        int ans=a + b;
        return a+b;

    }
    int sub(){
        return a - b;
    }
    int mul(){
        return a * b;
    }


}


public class Main {
    public static void main(String[] args) {
      Algebra obj=new Algebra(10,20);
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
      //  int a=sc.nextInt();
        System.out.println("enter the value of b:");
       // int b=sc.nextInt();
       int ans=obj.add();
       System.out.println(ans);
       System.out.println(obj.sub());
       System.out.println(obj.mul());

       Algebra obj2=new Algebra(5,10);
         ans=obj2.add();
        System.out.println(ans);
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());


       /* System.out.println(Math.sqrt(34));
        System.out.println(Math.sqrt(25));

        System.out.println(Math.floor(3.8));
        System.out.println(Math.floor(2.8));

        System.out.println(Math.ceil(3.4));
        System.out.println(Math.ceil(2.5));*/


    }
}