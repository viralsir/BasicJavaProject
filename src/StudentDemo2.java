import java.util.Scanner;

public class StudentDemo2
{
    public static void main(String[] args) {

        int rollno[]=new int[5];
        int maths[]=new int[5];
        int science[]=new int[5];
        int english[]=new int[5];
        String name[]=new String[5];
        int total;
        float avg;
        int Passing_marks=35;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            System.out.print("Enter rollno: ");
            rollno[i] = input.nextInt();
            System.out.print("Enter Name :");
            name[i]=input.next();
            do {
                System.out.print("Enter maths: ");
                maths[i] = input.nextInt();
            }while(maths[i]<0 || maths[i]>100);
            do {
                System.out.print("Enter science: ");
                science[i] = input.nextInt();

            }while(science[i]<0 || science[i]>100);
            do {
                System.out.print("Enter english: ");
                english[i] = input.nextInt();

            }while(english[i]<0 || english[i]>100);


        }


        System.out.println("\n output :\n");

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Roll No:"+rollno[i]);
            System.out.println("Name:"+name[i]);
            System.out.println("Maths:"+maths[i]);
            System.out.println("Science:"+science[i]);
            System.out.println("English:"+english[i]);

            if(maths[i]>=Passing_marks && english[i]>=Passing_marks && science[i]>=Passing_marks)
            {
                total=maths[i]+science[i]+english[i];
                avg=total/3.0f;
                System.out.println("Total Marks :"+total);
                System.out.println("Avg Marks :"+avg);
            }
            else {
                System.out.println("\nyou are fail ");
            }


        }




    }
}
