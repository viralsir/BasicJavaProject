import java.util.ArrayList;
import java.util.Scanner;

/*
    course
    Employee
    Product
    Reservation
    Addmission

 */


public class InstituteDemo
{
    // with Array
   /* public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int option=0,index=0;
        StudentDetail student[]=new StudentDetail[5];

        do
        {
            System.out.println("\t\t Student Details ");
            System.out.println("\t\t Press 1 for Entry");
            System.out.println("\t\t Press 2 for View");
            System.out.println("\t\t Press 3 for Search");
            System.out.println("\t\t Press 4 for Exit");

            System.out.print("Enter Your option :");
            option = sc.nextInt();

            switch(option)
            {
                 case 1:
                        String option2="y";
                        do
                        {
                            student[index] = new StudentDetail();
                            System.out.println("Enter Student ID:");
                            student[index].setId(sc.nextInt());
                            System.out.println("Enter Student Name :");
                            student[index].setName(sc.next());
                            System.out.println("Enter Student Maths Marks:");
                            student[index].setMaths(sc.nextInt());
                            System.out.println("Enter Student Science Marks:");
                            student[index].setScience(sc.nextInt());
                            System.out.println("Enter Student English Marks:");
                            student[index].setEnglish(sc.nextInt());
                            student[index].setTotal();
                            student[index].setAvg();

                            System.out.println("Do you want to add another student(y/n)?:");
                            option2 = sc.next();
                            index++;
                        }while(option2.equalsIgnoreCase("y"));
                 break;
                case 2:
                    System.out.println("\t\t View ");
                    for (int i = 0; i < index; i++)
                    {
                         student[i].display();
                    }
                break;
                case 3:
                    System.out.println("\t\t Search ");
                    System.out.println("Enter Roll no for Search :");
                    int rollno=sc.nextInt();
                    for (int i = 0; i < index; i++)
                    {
                        if(rollno==student[i].getId())
                        {
                            student[i].display();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("\t\t Exit ");
                break;
                default:
                    System.out.println("\t\t Invalid Option try again !!");
                    break;

            }

        }while(option !=4);


    }
*/

    //with ArrayList
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int option=0,index=0;
        ArrayList<StudentDetail> studentList=new ArrayList<StudentDetail>();

        do
        {
            System.out.println("\t\t Student Details ");
            System.out.println("\t\t Press 1 for Entry");
            System.out.println("\t\t Press 2 for View");
            System.out.println("\t\t Press 3 for Search");
            System.out.println("\t\t Press 4 for Exit");

            System.out.print("Enter Your option :");
            option = sc.nextInt();

            switch(option)
            {
                case 1:
                    String option2="y";
                    do
                    {

                        StudentDetail student=new StudentDetail();

                        System.out.println("Enter Student ID:");
                        student.setId(sc.nextInt());
                        System.out.println("Enter Student Name :");
                        student.setName(sc.next());
                        System.out.println("Enter Student Maths Marks:");
                        student.setMaths(sc.nextInt());
                        System.out.println("Enter Student Science Marks:");
                        student.setScience(sc.nextInt());
                        System.out.println("Enter Student English Marks:");
                        student.setEnglish(sc.nextInt());
                        student.setTotal();
                        student.setAvg();
                        studentList.add(student);

                        System.out.println("Do you want to add another student(y/n)?:");
                        option2 = sc.next();

                    }while(option2.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("\t\t View ");
                    for(StudentDetail student:studentList)
                    {
                        student.display();
                    }

//                    for (int i = 0; i < studentList.size(); i++)
//                    {
//                        studentList.get(i).display();
//                    }
                    break;
                case 3:
                    System.out.println("\t\t Search ");
                    System.out.println("Enter Roll no for Search :");
                    int rollno=sc.nextInt();
                    for(StudentDetail student:studentList){
                        if(rollno==student.getId()){
                            student.display();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("\t\t Exit ");
                    break;
                default:
                    System.out.println("\t\t Invalid Option try again !!");
                    break;

            }

        }while(option !=4);


    }


}
class StudentDetail
{
    int id;
    String name;
    String address;
    String phno;
    int maths;
    int science;
    int english;

    int total;
    float avg;
    boolean isPass;


    public void display()
    {
        System.out.println("Student Id:"+this.getId());
        System.out.println("Student Name:"+ this.getName());
        System.out.println("Student Maths Marks:"+this.getMaths());
        System.out.println("Student Science Marks:"+ this.getScience());
        System.out.println("Student English Marks:"+this.getEnglish());
        if(this.isPass())
        {
            System.out.println("You are Pass");
            System.out.println("Total :"+this.getTotal());
            System.out.println("Avg :"+this.getAvg());
        }
        else {
            System.out.println("You are Fail");
        }

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.maths+this.science+this.english;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg() {
        this.avg = this.total/3.0f;
    }

    public boolean isPass()
    {
        if(this.maths>=35 && this.science>=35 && this.english>=35)
        {
            this.isPass=true;
        }
        else {
            this.isPass=false;
        }

        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }
}
