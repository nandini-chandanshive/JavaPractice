import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(a);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to add in a: ");
        int x1 = input.nextInt();
        a += x1; //a = a + x1
        System.out.println("Updated value of a is: " + a);

        System.out.print("Enter a number to subtract from a: ");
        int x2 = input.nextInt();
        a -= x2;
        System.out.println("Updated value of a is: " + a);

        System.out.print("Enter a number to multiply in a: ");
        int x3 = input.nextInt();
        a *= x3;
        System.out.println("Updated value of a is: " + a);

        System.out.print("Enter a number to divide by a: ");
        int x4 = input.nextInt();
        a /= x4;
        System.out.println("Updated value of a is: " + a);

    }
}
