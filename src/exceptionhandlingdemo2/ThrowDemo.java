package exceptionhandlingdemo2;

import java.util.Scanner;

class MathException extends Exception
{
    String msg;
    MathException(String msg)
    {
        this.msg = msg;
    }
    String displaymsg()
    {
        return msg;
    }

}

public class ThrowDemo
{
    public static void main(String[] args)
    {
        try {
                int no1,no2;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter no1:");
                no1 = sc.nextInt();
                System.out.println("Enter no2:");
                no2 = sc.nextInt();

                if(no1>0 && no2>0)
                {
                    System.out.println("ans :"+(no1+no2));
                }
                else {

                    throw new MathException("Nagetive no are not allowed");
                }
        }
        catch (MathException e){
            System.out.println(e.displaymsg());
        }
    }
}
