import java.util.Scanner;

public class seven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value 1:");
        int a = sc.nextInt();
        System.out.println("Enter the value 2:");
        int b = sc.nextInt();
        System.out.println("Enter the operation to be done:");
        String d = sc.next();
        switch(d)
        {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
            case "&":
                System.out.println(a&b);
                break;
            case "|":
                System.out.println(a|b);
                break;
        }
    }
}
