import java.util.Scanner;
/*
    div wise store
    standard ,div ,student

 */
public class StudentDemo4
{
    public static void main(String[] args) {

        int rollno[] = new int[5];
        int maths[] = new int[5];
        int science[] = new int[5];
        int english[] = new int[5];
        String name[] = new String[5];
        int total;
        float avg;
        int Passing_marks = 35;
        int option = 0;
        Scanner input = new Scanner(System.in);
        int i=0;
        do
        {
            System.out.println("\n\n\t\t\t Student Info ");
            System.out.println("\t\t 1.Entry");
            System.out.println("\t\t 2.View");
            System.out.println("\t\t 3.Exit");

            System.out.println("Enter Your Option :");
            option = input.nextInt();

            switch (option) {
                case 1:
                       String option2="";
                       do
                       {
                        System.out.print("Enter rollno: ");
                        rollno[i] = input.nextInt();
                        System.out.print("Enter Name :");
                        name[i] = input.next();
                        do {
                            System.out.print("Enter maths: ");
                            maths[i] = input.nextInt();
                        } while (maths[i] < 0 || maths[i] > 100);
                        do {
                            System.out.print("Enter science: ");
                            science[i] = input.nextInt();

                        } while (science[i] < 0 || science[i] > 100);
                        do {
                            System.out.print("Enter english: ");
                            english[i] = input.nextInt();

                        } while (english[i] < 0 || english[i] > 100);

                       System.out.print("do you want to add another student ?(y/n): ");
                       option2 = input.next();

                       i++;
                    }while(option2.equalsIgnoreCase("y"));
                    break;
                case 2:
                    for (int j = 0; j < i; j++) {
                        System.out.println("Roll No:" + rollno[j]);
                        System.out.println("Name:" + name[j]);
                        System.out.println("Maths:" + maths[j]);
                        System.out.println("Science:" + science[j]);
                        System.out.println("English:" + english[j]);

                        if (maths[j] >= Passing_marks && english[j] >= Passing_marks && science[j] >= Passing_marks) {
                            total = maths[j] + science[j] + english[j];
                            avg = total / 3.0f;
                            System.out.println("Total Marks :" + total);
                            System.out.println("Avg Marks :" + avg);
                        } else {
                            System.out.println("\nyou are fail ");
                        }


                    }
                    break;
                case 3:
                    System.out.println("You are exited");
                    break;
                default:
                    System.out.println("\nInvalid Option try again !!");
                    break;


            }


        } while (option != 3);

    }
}