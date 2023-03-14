import java.util.Scanner;

public class two
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value 1:");
        int q = sc.nextInt();
        System.out.println("Enter the value 2:");
        int w = sc.nextInt();
        if(q>w)
        {
            System.out.println("Q is greater");
        }
        else if(w>q)
        {
            System.out.println("W is greater");
        }
        else {
            System.out.println("Q and W are equal");
        }

    }
}
