import java.util.Scanner;

/*
    interface : is use to declare or intilization member variable or member function

    all member variable which are declared inside an interface are
    by default public final .
    all member function which are declared inside an interface
    are by default public and does not have any body.

    a class which is implements an interface must define
    all the methods which is declared inside an interface.

    we can't create an object of an interface.

    we can't create an object of an abstract class.

     interface         /            abstract class
  all methods
  must be declared.                    declaration and defination both are allowed.


 */
public interface i1
{
    int PASSINGMARKS=35;
    void displaypassfail();
}
interface i2
{
    void displayi2();
}
abstract  class interfacedemo implements i1,i2
{
    int maths, science;

    @Override
    public void displaypassfail() {
        if (this.maths > this.PASSINGMARKS && this.science > this.PASSINGMARKS) {
            System.out.println("You are Pass");
        } else {
            System.out.println("You are Fail");
        }

    }
    void entry()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maths");
        maths = sc.nextInt();
        System.out.println("Enter science");
        science = sc.nextInt();
    }
    public static void main(String[] args) {

        interfacedemo obj = new interfacedemo2();
        //i1 obj1 = new interfacedemo();

        obj.entry();
        obj.displaypassfail();

    }


}
class interfacedemo2 extends interfacedemo {

    @Override
    public void displayi2() {

    }
}
