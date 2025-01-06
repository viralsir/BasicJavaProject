package exceptionhadlingDemo;
/*
    throws : is being used to ignore the exception.
 */

import java.io.DataInputStream;
import java.io.IOException;

public class throwsdemo2
{
    public static void main(String[] args)throws IOException
    {
            DataInputStream in = new DataInputStream(System.in);
            String no;
            System.out.println("Enter no: ");
            no = in.readLine();
            System.out.println("no:" + no);

    }
}
