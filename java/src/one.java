import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value 1: ");
        int a = sc.nextInt();
        System.out.println("Enter the value 2: ");
        int b = sc.nextInt();
        System.out.println("Output for sum, subtraction, multiplication, division and remainder of two numbers:\n");
        System.out.println("Sum of two numbers are: "+(a+b));
        System.out.println("Subtraction of two numbers are: "+(a-b));
        System.out.println("Product of two numbers are: "+(a*b));
        System.out.println("Division of two numbers are: "+(a/b));
        System.out.println("Remainder of two numbers are: "+(a%b));


    }
}