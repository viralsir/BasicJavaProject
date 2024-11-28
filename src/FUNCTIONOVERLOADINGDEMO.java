/*
polymorphism :
overloading
    constructor overloading.
    function overloading.
 */
public class FUNCTIONOVERLOADINGDEMO
{

    double  area(float radius){
        return 3.14*radius*radius;
    }

    double area(double length,double width){
       return length*width;
    }



    int total(int a, int b)
    {
        return a + b;
    }
    int total(int a, int b, int c)
    {
        return a + b + c;
    }



    public static void main(String[] args) {

        FUNCTIONOVERLOADINGDEMO Obj = new FUNCTIONOVERLOADINGDEMO();

        System.out.println("total :"+ Obj.total(12,23));
        System.out.println("total :"+Obj.total(12,23,34));
        System.out.println("Area of circle :"+Obj.area(4.0f));
        System.out.println("Area of Rectangle :"+Obj.area(3.0f,3.0f));

    }
}
