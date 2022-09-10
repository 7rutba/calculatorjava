import java.util.*;
public class calculator{
    public static void main(String [] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter First number :");
        int value1=input.nextInt();
        System.out.print("Choose a operator (+ ,- ,* ,/ ) :");
        String operator=input.next();
        System.out.print("Enter Second  number :");
        int value2=input.nextInt();
        switch(operator){
            case "+":
                System.out.println("Addition of two number  "+value1 +" "+ "And "+value2+"  "+"is :"+(value1+value2));
                break;
            case "-":
                System.out.println("Subtration of two number "+value1 +" "+ "And "+value2+"  "+"is :"+(value1-value2));
                break;
            case "*":
                System.out.println("Multiplication of two number "+value1 +" "+ "And "+value2+"  "+"is :"+(value1*value2));
                break;
            case "/":
                System.out.println("Division of two number "+value1 +" "+ "And "+value2+"  "+"is :"+(value1/value2));
                break;
            default:
                System.out.println("Please Enter a Valid operation ");

        }

    }
}