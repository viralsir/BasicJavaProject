package exceptionhandlingdemo2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
      Exception :-
       is a message which is being display when run time
      error is occured.

      1. message
      2. terminate

      message
      do not terminate.

      try
      catch
      finally
      throw
      throws : to ignore compiletime (checked) exception

       final keyword : constant
       finally block : all the statement of the final keyword has been executed in all situation.
       finlise :  to remove object.



 */
public class trycatchdemo
{
    public static void main(String[] args)
    {
        boolean isError=false;
        do {
            try
            {
                final int pi=23;
                //pi=33;

                trycatchdemo tr=new trycatchdemo();
                //tr.finalize();

                Scanner sc = new Scanner(System.in);
                int no1, no2;
                System.out.println("Enter No1:");
                no1 = sc.nextInt();
                System.out.println("Enter No2:");
                no2 = sc.nextInt();
                int ans = no1 / no2;
                System.out.println("Answer :" + ans);
                isError=false;
            }
            catch(ArithmeticException e)
            {
                System.out.println("zero is not allowed as a second input");
                isError=true;
            }
            /*catch(InputMismatchException e){
                System.out.println("Character are not allowed" );
                isError=true;
            }*/
            finally {
                System.out.println("finally statement has been called");
            }
        }while(isError);


        System.out.println("outside catch block");
    }
}
