import java.util.Scanner;

public class eight
{
    public static void main(String[] args)
    {
        Scanner sq=new Scanner(System.in);
        int f=sq.nextInt();
        int s=sq.nextInt();
        int i;
        System.out.println("Tables:");
        for(i=1;i<=s;i++)
        {
            System.out.println(f+"*"+i+"="+(f*i));
        }
    }
}
