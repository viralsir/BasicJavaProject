import java.util.Scanner;

/*
   Logical Operator

   Operator                     symbol
   Less than                    <
   Grater than                  >
   equal to                     ==
   not equal to                 !=
   Less than or
   equal to                     <=
   Grater than or
   equal to                     >=

      Logical Operator
      Operator                  Symbol
      and                           &&
      or                            ||
      not                           !




       conditional control structure
       1)if
            a)if else
                syntax :
                           if(condition)
                           {
                                statement;
                                true part
                            }
                            else
                            {
                                    false part;
                                    statement;
                             }
            b)else if
            c)neseted if
       2)switch


       cirucular control structure
 */
public class IFDemo
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int no1,no2,no3;

        System.out.println("Enter No1:");
        no1 = sc.nextInt();
        System.out.println("Enter No2:");
        no2 = sc.nextInt();
        System.out.println("Enter No3:");
        no3 = sc.nextInt();

        if(no1>0 && no2>0 && no3>0) {

            if (no1 > no2 && no1 > no3) {
                System.out.println(no1 + " is a maximum no");
            } else if (no2 > no1 && no2 > no3) {
                System.out.println(no2 + " is a maximum no");
            } else {
                System.out.println(no3 + " is a maximum no");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}














