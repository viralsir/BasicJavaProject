/*

    Inheritance : is the process by which object of
    one class can access or get the properties of object
    of another class.

    class A
    {
        int noA;
     }
       class B
       {
          int noB;
        }
      A a1=new A();
      a1.noA;
      a1.noB;

      B b1=new B();
      b1.noB;
      b1.noA;

    Inheritance

    Category of Inheritance :

    1) Single Inheritance : One object can access or get the Properties of
    only one object at a time.
          A    super class /base class / parent class
          |
          B    sub class / derived class / child class

    2) Multilevel Inheritance : continous chain of single inheritance.

            A
            |
            B
            |
            C
            |
            D

    3) Hyrarchical Inheritance : more than object can access or get the
    properties of same object.

                     A
              |             |
              B              C
    4) Multiple Inheritance : one object can access or get the properties of more than one object.
                          A      B
                              |
                              C
              not supported.
    5) Hybrid Inheritance : combination of more than one inheritance.

                      Personal Info
                      |             |
                    Employee         Customer
                      |
                      Dmart




 */

import java.util.Scanner;


class PersonalInfo
{
    int id;
    String name;
    String phno;
    String Address;

    void setPersonalInfo(String title)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+ title +" ID: ");
        id = sc.nextInt();
        System.out.println("Enter "+title+" Name: ");
        name = sc.next();
        System.out.println("Enter "+title+" Phone Number: ");
        phno = sc.next();
        System.out.println("Enter "+title+" Address: ");
        Address = sc.next();

    }
    void getPersonalInfo(String title){
        System.out.println(title + "ID: " + id);
        System.out.println(title + "Name: " + name);
        System.out.println(title + "Phone Number: " + phno);
        System.out.println(title + "Address: " + Address);

    }

}
//  sub class extends super class
class Employee extends PersonalInfo
{
    int salary;

    void setSalary(){

        setPersonalInfo("Employee");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        salary = sc.nextInt();
    }

    void getSalary(){
        getPersonalInfo("Employee");
        System.out.println("Salary: " + salary);
    }

}
class Customer extends PersonalInfo
{
    int billamount;

    void setBillamount(){
        setPersonalInfo("Customer");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bill Amount: ");
        billamount = sc.nextInt();
    }
    void getBillamount(){
         getPersonalInfo("Customer");
         System.out.println("Bill Amount: " + billamount);
    }
}
class Dmart extends  Employee
{
    String Location;

    void setLocation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Location: ");
        Location = sc.next();

    }
    void getLocation(){
        System.out.println("Location: " + Location);
    }

}
public class InheritanceDemo
{
    public static void main(String[] args)
    {
//           Employee emp = new Employee();

//           emp.setPersonalInfo();
//           emp.setSalary();
//
//           emp.getSalary();
//           emp.getPersonalInfo();

//            emp.setSalary();
//            emp.getSalary();

//               Dmart d = new Dmart();
//
//                d.setLocation();
//                d.setPersonalInfo();
//                d.setSalary();
//
//                d.getLocation();
//                d.getPersonalInfo();
//                d.getSalary();

        Employee emp = new Employee();
        emp.setSalary();

        Customer cust = new Customer();
        cust.setBillamount();

        emp.getSalary();
        cust.getBillamount();

    }

}
