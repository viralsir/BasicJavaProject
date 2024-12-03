package SmallProjectDemo;

import java.util.Scanner;

public class ProductDetails
{
    int id;
    String name;
    int qty;
    float rate;
    float price;

    void setProductDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product id: ");
        id = sc.nextInt();
        System.out.print("Enter product name: ");
        name = sc.next();
        System.out.print("Enter product qty: ");
        qty = sc.nextInt();
        System.out.print("Enter product rate: ");
        rate = sc.nextFloat();
        price = qty * rate;
    }

    void getProductDetails()
    {
        System.out.println(id+"\t"+name+"\t"+qty+"\t"+rate+"\t"+price);
    }

}
