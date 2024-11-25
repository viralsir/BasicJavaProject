/*
       Data Type
       1)Premetive Data type
                int ,char,float ,double ,boolean
                int no;
       2)Derived Data type
                Array
                int  no[5];

       3)Abstract Data type :
                  student(class) [int no,char name,int fees,float discount,double]

                  student s1(object),s2;
                            s1.no , s2.no

                  student s1=new student();
                 ref variable    object

           sample bunglow

default , public, private ,protected.

oop

class : bunch of related data.


 */
public class ClassDemo
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        Student s3 = s1;
        Student s4 = s2;
        s1.rollno=34;
        s1=s2;
        s2.rollno=45;
        s3=s4;
        System.out.println(s3.rollno);
    }
}

class Student
{
    // member variable
    int rollno;
    int course;
    int qty ;
    int rate;

}





