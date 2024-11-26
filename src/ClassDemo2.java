import java.util.Scanner;

public class ClassDemo2
{
    public static void main(String[] args) {

        StudentInfo student1 = new StudentInfo();
        student1.newStudentInfo();
        student1.displayStudentInfo();

        StudentInfo2 student2 = new StudentInfo2();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        student2.setName(sc.next());

        System.out.println("Name :"+ student2.getName());


    }
}
class StudentInfo
{
    String id;
    String name;
    String address;
    String phno;
    String email;

    public void newStudentInfo()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        id = sc.nextLine();
        System.out.println("Enter Student Name: ");
        name = sc.nextLine();
        System.out.println("Enter Student Address: ");
        address = sc.nextLine();
        System.out.println("Enter Student Phone Number: ");
        phno = sc.nextLine();
        System.out.println("Enter Student Email: ");
        email = sc.nextLine();
    }

    public void displayStudentInfo()
    {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Address: " + address);
        System.out.println("Student Phone Number: " + phno);
        System.out.println("Student Email: " + email);

    }



}
class StudentInfo2
{
    String id;
   private  String name;
    String address;
    String phno;
    String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}




