package exceptionhadlingDemo;
/*
    Exception : is a message which is being
    display when run time error is occured.

    try
    catch
    finally{}  final keyword   finalize() function / method
    throw
    throws

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception
{
    public static void main(String[] args) {

        //exception ex = new exception();
        //ex.finalize();

       final int no=23;
       //no=44;

        boolean isError = true;
        do{
            try
            {
                int no1, no2;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter no1: ");
                no1 = sc.nextInt();
                System.out.println("Enter no2: ");
                no2 = sc.nextInt();

                int ans = no1 / no2;
                System.out.println("answer :" + ans);
                isError = false;
            } catch (ArithmeticException e) {
                System.out.println("zero is invalid as a second input");
            }
//            catch(InputMismatchException e){
//                System.out.println("character are not allowed.");
//            }
            finally{
                System.out.println("statement in finally block.");
            }
    }while(isError);
        System.out.println("outside catch block");
    }
}
