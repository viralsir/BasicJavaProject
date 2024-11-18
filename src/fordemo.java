import java.util.Scanner;

/*
    for(intitalization of variable;condition;increment/decrement of varialbe)
    {
          statement;
     }
 */
public class fordemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting number: ");
        int n = sc.nextInt();

        for (int i = n; i < 50; i+=10) {
            if(i % 2 == 0) {
                System.out.println(i);
            }

        }




    }
}
