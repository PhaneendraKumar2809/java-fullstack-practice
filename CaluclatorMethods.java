import java.util.Scanner;

import static java.lang.System.exit;

public class CaluclatorMethods
{
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Welcome to Caluclator App");
        System.out.println(" Enter 1 for Addition \n Enter 2 for Subtraction \n Enter 3 for Multiplication \n Enter 4 for Division \n Enter 5 to check the number is even or not\n Enter 6 to exit ");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter the first number :");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number :");
                int num2 = sc.nextInt();
                Add(num1, num2);
                break;
            }
            case 2:
            {
                    System.out.println("Enter the first number :");
                    int num1 = sc.nextInt();
                    System.out.println("Enter the second number :");
                    int num2 = sc.nextInt();
                    if(num1>num2)
                    {
                        Sub(num1,num2);
                    }
                    else
                    {
                        Sub(num2,num1);
                    }
                    break;
            }
            case 3:
            {
                    System.out.println("Enter the first number :");
                    int num1 = sc.nextInt();
                    System.out.println("Enter the second number :");
                    int num2 = sc.nextInt();
                    Mul(num1, num2);
                    break;
            }
            case 4:
            {
                System.out.println("Enter the first number :");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number :");
                int num2 = sc.nextInt();
                Div(num1,num2);
                break;
            }
            case 5:
            {
                System.out.println("Enter the number to check weather it is Palindrome:");
                int num = sc.nextInt();
                Pal(num);
                break;
            }
            case 6:
                {
                    exit(0);
                }
        }}
    }
    public static void Add(int num1, int num2)
    {
            System.out.print("Sum of the two numbers:"+(num1+num2));
    }
    public static void Sub(int num1, int num2)
    {
        System.out.print("Difference of the two numbers:"+(num1-num2));
    }
    public static void Mul(int num1, int num2)
    {
        System.out.print("Product of the two numbers:"+(num1*num2));
    }
    public static void Div(int num1, int num2)
    {
        System.out.print("Division of the two numbers:"+(num1/num2));
    }
    public static void Pal(int n)
    {
        int m=n;
        int count = 0;
        int rev=0,temp;
        for(int i=n;i>=1;i=i/10)
        {
            count+=1;
        }
        for(int i=0;i< count;i++)
        {
            temp=n%10;
            rev=(rev*10)+temp;
            n=n/10;
        }
        if (m==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
