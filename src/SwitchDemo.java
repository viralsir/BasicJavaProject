import java.util.Scanner;

/*
      Switch:
            syntax :
                    switch(variable)
                    {
                         case option/value :
                                    statement;
                          break;
                          case option/value :
                                     statement;
                          break;
                          ----------------------
                          --------------------

                          default :
                                 statement;
                           break;
                       }
 */
public class SwitchDemo {
    public static void main(String[] args) {

        int no1,no2;
        int option;
        int ans;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No1:");
        no1 = sc.nextInt();
        System.out.println("Enter No2:");
        no2 = sc.nextInt();

        System.out.println("\n\t\t Calculator ");
        System.out.println("\t Press 1 for Addtion");
        System.out.println("\t Press 2 for Subtraction");
        System.out.println("\t Press 3 for Multiplication");
        System.out.println("\t Press 4 for Division");

        System.out.println("Enter Your option :");
        option = sc.nextInt();

        switch(option) {
            case 1:
                ans = no1 + no2;
                System.out.println("Total :" + ans);
                break;
            case 2:
                ans = no1 - no2;
                System.out.println("Subtraction  :" + ans);
                break;
            case 3:
                ans = no1 * no2;
                System.out.println("Multiplication  :" + ans);
                break;
            case 4:
                ans = no1 / no2;
                System.out.println("Division  :" + ans);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }






    }
}












