package exceptionhadlingDemo;

import java.util.Scanner;

public class throwdemo2
{
    public static void main(String[] args)
    {

        try{
            int no1,no2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no1: ");
            no1 = sc.nextInt();
            System.out.println("Enter no2: ");
            no2 = sc.nextInt();
            if(no1<0 || no2<0)
            {

                throw new UDFException();
            }
        }
        catch (UDFException e){
            e.displaymsg("nagetive input are not allowed.");
        }

    }
}
class UDFException extends Exception
{
    public void displaymsg(String msg){
        System.out.println(msg);
    }
}