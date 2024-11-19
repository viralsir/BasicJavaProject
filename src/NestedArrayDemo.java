import java.util.Scanner;

public class NestedArrayDemo
{
    public static void main(String[] args) {
        //int no[][]={ {33,34},{23,22}};
//        System.out.println(no[1][0]);

        Scanner sc = new Scanner(System.in);

        int no[][]=new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter No:");
                no[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n output :\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(no[i][j]+" ");
            }
            System.out.println();
        }

    }
}
