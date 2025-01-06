package access_idenfiter_demo;

public class optionone
{
    private int pr=23;
    protected int pro=344;
    int d=344;
    public int pu=343;

    public static void main(String[] args)
    {
          optionone ob=new optionone();
        System.out.println("private int pr :"+ob.pr);
        System.out.println("protected int pro :"+ob.pro);
        System.out.println("defualt int d :"+ob.d);
        System.out.println("public int pu :"+ob.pu);
    }
}
class optiontwo extends optionone
{
    public static void main(String[] args)
    {
        //optionone ob=new optionone();
        optiontwo ob=new optiontwo();
       // System.out.println("private int pr :"+ob.pr);
        System.out.println("protected int pro :"+ob.pro);
        System.out.println("defualt int d :"+ob.d);
        System.out.println("public int pu :"+ob.pu);
    }
}