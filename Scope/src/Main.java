
class Algebra{
  /*  int a;
    int b;
    int add(){
        int p=10;
        int q=20;
        return p+q;
    }
    int sub(){
      //  return p-q;  //we are unable to access p,q in ouside the add method

        return a-b;
    }
    void demo(){
        int a=10;
        System.out.println(a);
       // System.out.println(c); unable to access block level variables in method level
        {
            int c=10;
            System.out.println(c);
        }
        {
            int c=20;
            System.out.println(c);
        }
    }
    */
    void changevalue(int a){
        a*=100;
        System.out.println("inside change value a is:"+a);
    }

}



public class Main {
    public static void main(String[] args) {
       Algebra obj=new Algebra();
       // obj.demo();
        int a=10;
        System.out.println("Before changing value a is:"+a);
       obj. changevalue(a);
       System.out.println("after changing value a is:"+a);

    }
}