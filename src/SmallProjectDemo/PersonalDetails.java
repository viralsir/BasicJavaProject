package SmallProjectDemo;

/*
    class name  :  PersonalDetails
    description : It is represent Personal information for customer as well as vendor
    created by  : Viral Sir
    created on  : 3-12-2024
    verify by   :
 */
import java.util.Scanner;
public class PersonalDetails
{
    int id;
    String name;
    String phoneNumber;
    String address;

    void setPersonalDetails(String title)
    {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter "+title +" ID: ");
          id = sc.nextInt();
          System.out.print("Enter "+title+" Name: ");
          name = sc.next();
          System.out.print("Enter "+title+" Phone: ");
          phoneNumber = sc.next();
          System.out.print("Enter "+title+" Address: ");
          address = sc.next();
    }

    void getPersonalDetails(String title)
    {
        System.out.println(title +" Id : "+id);
        System.out.println(title +" Name : "+name);
        System.out.println(title +" Phone : "+phoneNumber);
        System.out.println(title +" Address : "+address);

    }

}
