import pw.skills.App;
public class Outsidepwskills {
    public static void main(String[] args) {
        App obj = new App();
        System.out.println("outside the package,non-child class"+obj.str_1);

    }
}
class App3 extends App{
    void printfromchildclass(){
        App3 obj3=new App3();
      System.out.println("child class:"+obj3 .str_1);
    }


}
