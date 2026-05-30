public class IfElse {
    public static void main(String[] args) {

        boolean isMale = false;
        String name = "Bob";

        System.out.println("before if");
        if(isMale){
            System.out.println("Mr. " + name);
        }else{
            System.out.println("Ms. " + name);
        }
        System.out.println("After if");


        boolean isSenior = true;
        boolean isAdult = false;

        if(isSenior){
            System.out.println("hello seniorcitizen");
        }
        else if(isAdult){
            System.out.println("hello Adult");
        }
        else{
            System.out.println("hello child");
        }
    }
}
