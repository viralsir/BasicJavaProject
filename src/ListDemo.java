import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
    public static void main(String[] args)
    {
        // Collection classes
        //ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

//        list.add(23);
//        list.add(44);
//
//        for (Integer i : list)
//        {
//            System.out.println(i);
//        }
       Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++)
        {
            System.out.println("Enter No:");
            list.add(sc.nextInt());
        }

        System.out.println("\n output :\n");
        for (Integer i : list)
        {
            System.out.println(i);
        }


//        System.out.println("first value :"+ (int)list.get(0));
//        System.out.println("Second value :"+ (int)list.get(1));

    }

}
