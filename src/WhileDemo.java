import java.util.Scanner;

/*
     Circular Control Structure

       loop
       1)while
                syntax :
                            initialization of variable
                            while(condition)
                            {
                                    true part;
                                    increment/decrement of variable
                             }
       2)do while
       3)for



 */
public class WhileDemo
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter starting  number: ");
//        int start=sc.nextInt();
//        System.out.println("Enter ending  number: ");
//        int end=sc.nextInt();
//
//        while(start<end){
//            System.out.println(start);
//            //start=start+10;
//           // start++;
//            start +=10;
//        }
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        int start=1;
//        while(start<=10)
//        {
//            System.out.println(num+"*"+start+"="+num*start);
//            start++;
//        }

        int start=1;
        int sum=0;
        while(start<=5){
            System.out.println("Enter No:");
            int no = sc.nextInt();
            sum=sum+no;
            start++;
        }
        System.out.println("sum :"+sum);





    }
}
