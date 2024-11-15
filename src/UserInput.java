import java.util.Scanner;

/*
java UserInput 12 vimal 23

    command line
    12 "vimal" 23    args[0]

   Util
   Scanner

 */
public class UserInput
{
    public static void main(String[] args)
    {
        int no;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter No:");
        no=input.nextInt();
        System.out.print("Enter Name:");
        String name=input.next();
        System.out.print("Enter Avg :");
        float avg=input.nextFloat();

        System.out.println("No:"+no);
        System.out.println("Name:"+name);
        System.out.println("Avg:"+avg);

    }
}
