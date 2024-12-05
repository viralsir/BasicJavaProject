package SmallProjectDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class DMart
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Vendor> vendors = new ArrayList<Vendor>();
//        ArrayList<Cutomer> customers=new ArrayList<Cutomer>();
//
         ArrayList<Order> vendors=new ArrayList<Order>();
         ArrayList<Order> customers=new ArrayList<Order>();

        int option1=0,option2=0;

        do
        {
            System.out.println("\n\t\t\t Dmart \n\n");
            System.out.println(" 1.Purchase");
            System.out.println(" 2.Sales");
            System.out.println(" 3.Exit");

            System.out.print("Enter your option: ");
            option1 = sc.nextInt();

            switch (option1)
            {
                case 1:
                    do{
                        System.out.println("\n\t\t\t Purchase \n\n");
                        System.out.println("1.Entry");
                        System.out.println("2.View");
                        System.out.println("3.Main Menu");

                        System.out.println("Enter your option: ");
                        option2 = sc.nextInt();

                        switch (option2)
                        {
                            case 1:
                                 String option3="y";
                                 do{
                                     System.out.println("\n\t\t\t Purchase  Entry\n\n");
                                     //Vendor vendor=new Vendor();
                                     Order order=new Order();
                                     order.setOrder("Vendor");
                                     vendors.add(order);
                                     System.out.println("Do you want to add another bill(y/n)?:");
                                     option3 = sc.next();

                                 }while(option3.equalsIgnoreCase("y"));
                                 break;
                            case 2:
                                System.out.println("\n\t\t\t Purchase  View\n\n");
                                for(Order v:vendors)
                                {
                                     v.getOrder("vendor");
                                    System.out.println("------------------------");
                                }
                            break;
                            case 3:
                                System.out.println("\n\t\t\t Back  Main Menu\n\n");
                                break;
                            default:
                                System.out.println("\n Wrong option selected try again !!!");
                            break;

                        }




                    }while(option2!=3);
                break;
                case 2:
                    do{
                        System.out.println("\n\t\t\t Sales \n\n");
                        System.out.println("1.Entry");
                        System.out.println("2.View");
                        System.out.println("3.Main Menu");

                        System.out.println("Enter your option: ");
                        option2 = sc.nextInt();

                        switch (option2)
                        {
                            case 1:
                                String option3="y";
                                do{
                                    System.out.println("\n\t\t\t Sales  Entry\n\n");
                                    Order order=new Order();
                                    order.setOrder("Customer");
                                    customers.add(order);
                                    System.out.println("Do you want to add another bill(y/n)?:");
                                    option3 = sc.next();

                                }while(option3.equalsIgnoreCase("y"));
                                break;
                            case 2:
                                System.out.println("\n\t\t\t Sales  View\n\n");
                                for(Order c:customers)
                                {
                                    c.getOrder("Customer");
                                    System.out.println("------------------------");
                                }
                                break;
                            case 3:
                                System.out.println("\n\t\t\t Back  Main Menu\n\n");
                                break;
                            default:
                                System.out.println("\n Wrong option selected try again !!!");
                                break;

                        }




                    }while(option2!=3);
                break;
                case 3:
                    System.out.println("You are Exited");
                    break;
                default:
                    System.out.println("\n Wrong option selected try again !!!");
                    break;
            }



        }while(option1 !=3);







    }
}
