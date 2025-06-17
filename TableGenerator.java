import java.util.Scanner;

public class TableGenerator
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want the table:");
        int n = sc.nextInt();
        for(int i=1;i<=20;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}