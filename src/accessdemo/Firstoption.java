package accessdemo;

public class Firstoption {

    private int pr=23;
    protected int pro=344;
    int d=34;
    public int pu=3434;

    public static void main(String[] args) {

        Firstoption f=new Firstoption();
        System.out.println("private int pr :"+ f.pr);
        System.out.println("protected int pro :"+ f.pro);
        System.out.println("Default int d :"+ f.d);
        System.out.println("public int pu :"+ f.pu);

    }



}
class secondoption extends Firstoption
{
    public static void main(String[] args) {

        //Firstoption f=new Firstoption();
        secondoption f=new secondoption();
        //System.out.println("private int pr :"+ f.pr);
        System.out.println("protected int pro :"+ f.pro);
        System.out.println("Default int d :"+ f.d);
        System.out.println("public int pu :"+ f.pu);

    }

}