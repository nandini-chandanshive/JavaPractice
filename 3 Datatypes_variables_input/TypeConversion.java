import java.lang.*;

public class TypeConversion{
    public static void main(String[] args){

        //implicit
        long big = 45;
        System.out.println(big);
        float dec = 3;
        System.out.println(dec);
        double d = 3.4f;
        System.out.println(d);

        //explicit
        float eDec = (float)3.4;
        System.out.println(eDec);
        long eBig = (long)3.4;
        System.out.println(eBig);
        int eInt = (int)3.4;
        System.out.println(eInt);

        int a = (int)4.7;
        System.out.println(a);


    }
}
