/*
  do while :

      intialization of variable
      do
      {
          statement;
          increment/decrement of variable;
         }while(condition);


 */

import java.util.Scanner;

public class DoWhileDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int start=sc.nextInt();
        do
        {
            System.out.println(start);
            start++;
        }while(start>=10);

    }

}
