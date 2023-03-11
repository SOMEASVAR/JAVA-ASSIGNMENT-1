# JAVA-ASSIGNMENT-1
# 1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
## Program:
```
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
```
## Output:
![image](https://user-images.githubusercontent.com/93434149/224461653-0131c3b5-6bcc-42aa-a3a2-df01934c80e8.png)

# 2. Write a Java program to compare two numbers.
## Program:
```
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

```
## Output:
![image](https://user-images.githubusercontent.com/93434149/224462104-d4fdea99-f3d9-4092-ada4-eb31326520c7.png)
# 3.Write a Java program to convert a string to an integer.
## Program:
```
public class three {
    public static void main(String[] args) {
        String sa = "100";
        int a = Integer.parseInt(sa);
        System.out.println(a);
    }

}
```
## Output:
![image](https://user-images.githubusercontent.com/93434149/224462467-8c33a8b6-1ff5-4664-ac53-8e60930dc888.png)
# 4.Java Program to find area of rhombus
## Program:
```
import java.util.Scanner;

public class four
{
    public static void main(String[] args)
    {
        Scanner sd =new Scanner(System.in);
        System.out.println("Enter the value 1:");
        int l= sd.nextInt();
        System.out.println("Enter the value 2:");
        int k = sd.nextInt();
        int area=(l*k)/2;
        System.out.println("Area of the rhombus:");
        System.out.println(area);


    }
}

```
## Output:
![image](https://user-images.githubusercontent.com/93434149/224462717-e6ca2db7-f12a-4b43-b07b-e57a261b043a.png)
# 5. Write a Java program to find the number of days in a month.
## Program:
```
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

```
## Output:
![image](https://user-images.githubusercontent.com/93434149/224463068-16fb6e6f-77e9-4e34-ac34-8312e9e077ea.png)
# 6.Write a Java program to print the even numbers from 1 to 20.
## Program:
```
public class six
{
    public static void main(String[] args)
    {
        int i;
        System.out.println("Even numbers from the range 1 to 20 are:");
        for(i=0;i<=20;i++)
        {

            if(i%2==0)
            {

                System.out.print(" " +i);
            }
        }
    }
}

```
## Output:
![image](https://user-images.githubusercontent.com/93434149/224463392-ad5b002f-066c-4a50-a743-670e687291f6.png)

# 7. Write a Java program to create a simple calculator.
## Program:
```
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

```
## Output:
![image](https://user-images.githubusercontent.com/93434149/224463739-01d57a0c-bc9b-44d2-93b8-16387bb30e82.png)


