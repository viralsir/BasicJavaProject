package exceptiondemo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//throws : ignore the exception
public class ThrowsDemo
{
    public static void main(String[] args)throws IOException
    {

            DataInputStream din = new DataInputStream(System.in);
            System.out.println("enter No:");
            int no = din.readInt();
            System.out.println("no" + no);

            // CheckedException
            // UnCheckedException

    }
}
