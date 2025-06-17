import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.print("Even Number");
        }
        else
        {
            System.out.print("Odd Number");
        }
    }
}
