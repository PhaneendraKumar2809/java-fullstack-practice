import java.util.Scanner;

public class Palindrome
{
    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int m=n;
        int count = 0;
        int rev=0,temp;
        for(int i=n;i>=1;i=i/10)
        {
            count+=1;
        }
        System.out.println("Count:"+count);
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
