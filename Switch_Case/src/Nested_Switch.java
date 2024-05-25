import java.util.Scanner;
public class Nested_Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empId =sc.nextInt();
        String department=sc.next();

        switch(empId){
            case 1:
                System.out.println("Chandra Mouli");
                break;
            case 2:
                System.out.println("software");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("no Department");
                }
                break;
            default:
                System.out.println("enter correct EmpId");
        }

    }
}
