package exceptiondemo;

import java.util.Scanner;

public class THROWDEMO
{
    public String toString()
    {
        return "hello";
    }


    public static void main(String[] args)
    {
        try{
            int no1,no2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no1: ");
            no1 = sc.nextInt();
            System.out.println("Enter no2: ");
            no2 = sc.nextInt();

            if(no1<0 || no2<0)            {
                throw new MathException("Nagetive input are not allowed.");
            }
        }
        catch(MathException e){
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(" zero invalid as a second input");
        }
    }
}
class MathException extends Exception
{
    String msg;
    MathException(String msg)
    {
           this.msg = msg;
    }
    public String toString()
    {
        return msg;
    }

}