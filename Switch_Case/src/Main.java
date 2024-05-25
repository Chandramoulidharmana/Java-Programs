import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();

        switch(fruit){
            case "mango":
                System.out.println("king of fruits");
                break;
            case"Apple":
                System.out.println("A sweet red Fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            case "Grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("enter the valid input");
        }
//        switch (fruit) {  WE CAN ALSO WRITE IN THIS WAY ALSO
//            case "mango" -> System.out.println("king of fruits");
//            case "Apple" -> System.out.println("A sweet red Fruit");
//            case "Orange" -> System.out.println("Round Fruit");
//            case "Grapes" -> System.out.println("small fruit");
//            default -> System.out.println("enter the valid input");
 //       }
        int day=sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("enter valid Day");
        }


    }
}