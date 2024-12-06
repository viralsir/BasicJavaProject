package exceptiondemo;
/*
       Exception Handling :
       try
       catch
       finally :   final (keyword)  finalise()(function)  finally(block)
       throw   : THROW TO THROW USER DEFINE EXCEPTION
       throws

 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo
{
    public static void main(String[] args)
    {
        final int no=23;
        final int PASSING_MARKS=12;
        //no=45;





        boolean isError=true;
        do {
            try {
                int no1, no2;


                Scanner sc = new Scanner(System.in);
                System.out.println("Enter no1: ");
                no1 = sc.nextInt();
                System.out.println("Enter no2: ");
                no2 = sc.nextInt();

                float ans = no1 / no2;

                System.out.println("Answer :" + ans);
                isError=false;
            }catch(ArithmeticException e){
                System.out.println("zero is invalid as second input");
            }
//            catch(InputMismatchException e){
//                System.out.println("Character is not valid");
//            }
            finally
            {
                System.out.println("finally block is being executed.");
            }
        }while(isError);

       System.out.println(" outside try block");

    }
}
