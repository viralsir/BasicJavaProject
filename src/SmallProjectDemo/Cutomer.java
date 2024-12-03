package SmallProjectDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Cutomer extends PersonalDetails
{
    int billno;
    String billdate;
    float totalamount;
    float discount;
    float tax;
    float billamount;

    ArrayList<ProductDetails> products=new ArrayList<>();

    void setCustomer()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the billno");
        billno=sc.nextInt();
        System.out.print("Enter the billdate");
        billdate=sc.next();

        setPersonalDetails("Customer");
        String option="y";
        do{
               ProductDetails product=new ProductDetails();
               product.setProductDetails();
               totalamount = totalamount + product.price;
               System.out.println("do you want to add another bill ?(Y/N):");
               option=sc.next();
               products.add(product);

        }while(option.equalsIgnoreCase("y"));

        System.out.println("Enter Discount (%):");
        discount=sc.nextFloat();
        discount = (discount*totalamount) / 100;
        System.out.println("Enter Tax (%):");
        tax=sc.nextFloat();
        tax = (tax*totalamount) / 100;
        billamount = billamount + tax-discount;
    }

    void getCustomer(){

        System.out.println("Bill No:"+billno);
        System.out.println("Bill Date:"+billdate);
        getPersonalDetails("Customer");

        System.out.println("Id \t Name \t Qty \t Rate \t Price \n");
        System.out.println("=========================================");

        for(ProductDetails product : products)
        {
            product.getProductDetails();
        }

        System.out.println("Total Amount :"+totalamount);
        System.out.println("Discount :"+discount);
        System.out.println("Tax :"+tax);
        System.out.println("Bill Amount :"+billamount);


    }



}
