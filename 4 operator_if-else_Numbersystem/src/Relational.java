import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to license portal");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("You ar eligible for drive");
        }
        else{
            System.out.println("You are not eligible");
        }
    }
}
