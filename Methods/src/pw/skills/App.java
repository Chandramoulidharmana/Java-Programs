package pw.skills;

public class App {
    public String str_1 ="I am a public member";
    void printfromclass(){
        System.out.println("within class:"+ str_1);
    }

    public static void main(String[] args) {
        App obj=new App();
        obj.printfromclass();
        System.out.println(obj.str_1);
        App2 obj2=new App2();
        obj2.printOutsideclass();
    }

}
class App2{
    void printOutsideclass(){
        App obj=new App();
        System.out.println("within the package,outside the class :" + obj.str_1);

    }

}
