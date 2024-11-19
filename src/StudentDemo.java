import java.util.Scanner;

public class StudentDemo
{
    public static void main(String[] args) {

        int rollno,maths,science,english;
        String name;
        int total;
        float avg;
        int Passing_marks=35;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter rollno: ");
        rollno = input.nextInt();
        System.out.print("Enter Name :");
        name=input.next();
        do {
            System.out.print("Enter maths: ");
            maths = input.nextInt();
        }while(maths<0 || maths>100);
        do {
            System.out.print("Enter science: ");
            science = input.nextInt();

        }while(science<0 || science>100);
        do {
            System.out.print("Enter english: ");
            english = input.nextInt();

        }while(english<0 || english>100);

        System.out.println("\n output :\n");
        System.out.println("Roll No:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Maths:"+maths);
        System.out.println("Science:"+science);
        System.out.println("English:"+english);

        if(maths>=Passing_marks && english>=Passing_marks && science>=Passing_marks)
        {
            total=maths+science+english;
            avg=total/3.0f;
            System.out.println("Total Marks :"+total);
            System.out.println("Avg Marks :"+avg);
        }
        else {
            System.out.println("\nyou are fail ");
        }



    }
}
