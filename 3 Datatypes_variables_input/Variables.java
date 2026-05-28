import java.lang.*;

public class Variables{
    public static void main(String[] args){

        int num1 = 10;
        System.out.println(num1);
        int num2;
        num2 = 20;
        System.out.println(num2);
        num2 = 30;
        System.out.println(num2);

//        float n1 = 5.0;    //will consider it double and will give error thats why we will add f to it
        float n1 = 5.0f;
        System.out.println(n1);
        float n2 = 5;
        System.out.println(n2);

        double n3 = 2.45686; //jisse number ko hum point lagake likhte hai usse bydefault wo double manta hai
        System.out.println(n3);

        boolean isIndian = true;
        System.out.println(isIndian);

        String greeting = "good morning"; //string defined in double quotes
        System.out.println(greeting);

        char myCharacter = 'n';
        System.out.println(myCharacter);


    }
}
