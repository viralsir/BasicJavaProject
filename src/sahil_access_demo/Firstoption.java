package sahil_access_demo;

public class Firstoption
{
    private int pri=23;
    protected int r=232;
    int d=343433;
    public int u=34333;

    /*public static void main(String[] args) {

        Firstoption f=new Firstoption();
        System.out.println("private int pri :"+f.pri);
        System.out.println("protected int r :"+f.r);
        System.out.println("default  int d :"+f.d);
        System.out.println("public int u :"+f.u);


    }
*/
}
class secondoption  extends Firstoption
{

    public static void main(String[] args) {

       // Firstoption f=new Firstoption();
       secondoption f=new secondoption();
       // System.out.println("private int pri :"+f.pri);
        System.out.println("protected int r :"+f.r);
        System.out.println("default  int d :"+f.d);
        System.out.println("public int u :"+f.u);


    }
}
