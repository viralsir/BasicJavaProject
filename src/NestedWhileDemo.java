public class NestedWhileDemo {

    public static void main(String[] args) {


        int start=1;
        while(start<=5){
            int i=1;
            while(i<=start){
                System.out.print(i+" ");
                i++;
            }
            System.out.println();
            start++;
        }


    }
}
