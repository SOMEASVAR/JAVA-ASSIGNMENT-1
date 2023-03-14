import java.util.Scanner;

public class five
{
    public static void main(String[] args)
    {
        Scanner se =new Scanner(System.in);
        System.out.println("Enter the Month:");
        int month = se.nextInt();
        System.out.println("Enter the year:");
        int year = se.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            System.out.println("Month has 31 days");
        }
        else if(month==4||month==6||month==9||month==11)
        {
            System.out.println("Month has 30 days");
        }
        else
        {
            if(year%400==0||year%4==0&&year%100!=0)
            {
                System.out.println("Month has 29 days");
            }
            else {
                System.out.println("Month has 28 days");
            }
        }
    }
}
