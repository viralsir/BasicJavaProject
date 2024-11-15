/*
     Arithmatic Operator

     operator                   symbol
     Addition                   +
     Substraction               -
     Multiplication             *
     Division                   /
     Module                     %

 */
public class ArithmeticOperator
{
    public static void main(String[] args) {
        int no1=2;
        int no2=3;
        int total=no1+no2;
        float avg=(no1+no2)/2.0f;
        System.out.println("Addition :"+total);
        System.out.println("Avg :"+avg);
        System.out.println("Subtraction :"+ (no1-no2));
        System.out.println("Multiplication :"+no1*no2);
        System.out.println("Division :"+(no1/no2));
        System.out.println("Module :"+no1%no2);


    }
}
