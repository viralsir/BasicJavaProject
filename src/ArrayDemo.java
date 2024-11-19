import java.util.Scanner;

/*
      2) Derived Data type
      Array : is a collection of same type of data.
                or
      is a shared name of multiple memorry block.
    syntax :
                datatype variablename[]=new datatype[size];

    int no;
    int no[]=new int[5];
    no[0],no[1],---,no[4]

   one di numeric  array

   int no[][]=new int[][];

 */
public class ArrayDemo
{
    public static void main(String[] args) {
        int no[]=new int[5];

        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter No1:");
//        no[0]=sc.nextInt();
//        System.out.println("Enter No2:");
//        no[1]=sc.nextInt();
//
//        System.out.println("no[0]:"+no[0]);
//        System.out.println("no[1]:"+no[1]);
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter No:");
            no[i]=sc.nextInt();

        }
        System.out.println("\n output :\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(no[i]);
        }


    }

}
