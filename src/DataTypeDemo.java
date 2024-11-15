/*

static type language
no=23
no="vimal"

int no

      Datatype : type of data

      category of data type
      1)Premetive Data type or inbuilt Data type
      2)Derived Data Type
      3)Abstract Data type

      1)Premetive Data type or inbuilt data type
      1 byte = 8 bits

Keyword                     use                         byte                        range
boolean                  true/false                     jvm                             jvm
byte                    numeric value                   1                               -128 to 127
char                    character,symbol                2                               -32768 to 32767
int                     numeric value                   4                                huge value
long                    numeric value                   8                                huge value
float                   decimal value                   8                                huge value
double                  decimal value                   16                               very huge value


String

wrapper class

int     Integer
byte    Byte


variable : is a name of the memory location in which value is being stored.
naming rules of variable
1)first letter must be alphabet or underscore    no1  , 1no
2)symbol , keyword and space are not allowed.





 */

public class DataTypeDemo
{
    public static void main(String[] args)
    {
            boolean b=true;  // Intialization of variable
            byte y;   // declaration of variable
            char c='t';
            String s="vimal";
            int no=3;
            float fl=34334.343f;
            double d=33434343434.3434;

            y=34;
            no=y;   // samller into bigger   implicit type conversion
            y=(byte)no;  //  bigger into smaller   explicit type conversion

        System.out.println("Boolean b:" + b);
        System.out.println("Byte b:" + y);
        System.out.println("Char b:" + c);
        System.out.println("String s:" + s);
        System.out.println("int no:" + no);
        System.out.println("float fl:" + fl);
        System.out.println("double d:" + d);

    }
}
