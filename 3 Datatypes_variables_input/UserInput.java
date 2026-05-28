import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);  //isse yaad karlo input ke liye
        System.out.print("Please Enter your name: ");
        String name = input.nextLine();  // method for taking string as input
        System.out.println("Good Morning! " + name);
        System.out.print(name + ",also tell me your age: ");
        int age = input.nextInt(); //method for taking integer as an input
        System.out.println("Your age is: " + age);

    }
}
