package exceptionhandlingdemo2;

import java.io.DataInputStream;
import java.io.IOException;

public class throwsdemo
{
    public static void main(String[] args)throws IOException
    {

          int no1;

          DataInputStream in = new DataInputStream(System.in);

          System.out.println("Enter no1:");
          no1 = in.readInt();


    }
}
