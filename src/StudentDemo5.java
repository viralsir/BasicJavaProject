import java.util.ArrayList;
import java.util.Scanner;

/*
    div wise store
    standard ,div ,student

 */
public class StudentDemo5
{
    public static void main(String[] args) {

//        ArrayList student=new ArrayList();
//
//        student.add(1);  //0
//        student.add("vimal"); //1
//        student.add(23);  //2
//        student.add(44);  //3
//        student.add(55);  //4
//
//
//        student.add(2);  //5
//        student.add("viren"); //6
//        student.add(23);  //7
//        student.add(44);  //8
//        student.add(55);  //9
//


        ArrayList<Integer> rollno = new ArrayList<Integer>();
        ArrayList<Integer> maths = new ArrayList<Integer>();
        ArrayList<Integer> science= new ArrayList<Integer>();
        ArrayList<Integer> english = new ArrayList();
        ArrayList<String> name = new ArrayList<String>();
        int total;
        float avg;
        int marks;
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
                        rollno.add(input.nextInt());
                        System.out.print("Enter Name :");
                        name.add(input.next());
                        boolean iscorrect=false;
                        do {
                            System.out.print("Enter maths: ");
                            marks = input.nextInt();
                            if(marks<0 || marks>100)
                            {
                                iscorrect=true;
                            }
                            else
                            {
                                maths.add(marks);
                                iscorrect=false;
                            }


                        } while (iscorrect);
                        do
                        {
                            System.out.print("Enter science: ");
                            marks=input.nextInt();
                            if(marks<0 || marks>100)
                            {
                                iscorrect=true;
                            }
                            else
                            {
                                science.add(marks);
                                iscorrect=false;
                            }

                        } while (iscorrect);
                        do
                        {
                            System.out.print("Enter english: ");
                            marks = input.nextInt();
                            if(marks<0 || marks>100)
                            {
                                iscorrect=true;
                            }
                            else
                            {
                                english.add(marks);
                                iscorrect=false;
                            }

                        } while (iscorrect);

                       System.out.print("do you want to add another student ?(y/n): ");
                       option2 = input.next();
                       i++;
                    }while(option2.equalsIgnoreCase("y"));
                    break;
                case 2:


                    for (int j = 0; j < maths.size(); j++)
                    {
                        System.out.println("Roll No:" + rollno.get(j));
                        System.out.println("Name:" + name.get(j));
                        System.out.println("Maths:" + maths.get(j));
                        System.out.println("Science:" + science.get(j));
                        System.out.println("English:" + english.get(j));

                        if (maths.get(j) >= Passing_marks && english.get(j) >= Passing_marks && science.get(j) >= Passing_marks) {
                            total = maths.get(j) + science.get(j) + english.get(j);
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