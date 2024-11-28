/*
    Constructor : is a special function which is being used
    to initialize the member variable.

    - constructor name and class name must be same.
    - it does not return any value.
    - it is by default called when the object of same class is created.

   polymorphism : one name multiple use.

    overloading .
    constructor overloading.


 */
public class ConstructorDemo
{
    public static void main(String[] args) {
        Product p1=new Product(0);
        Product p2=new Product(20);

        System.out.println(p1.id);
        System.out.println(p1.discount);
        System.out.println(p2.discount);

    }
}
class Product
{
    int id=12;
    String name;
    float discount=0f;

    // non parameterize constructor  or default constructor
//    Product(){
//        id=24;
//        name="";
//        discount=0;
//        System.out.println("product() is called.");
//    }
   // parameterize constructor
   Product(float userdiscount){
        discount=userdiscount;
   }



}








