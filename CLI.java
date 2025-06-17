import java.util.*;
public class CLI
{
    public static void main (String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to CLI calculator");
        System.out.print("Enter the First Number:");
        int i= sc.nextInt();
        System.out.print("Enter the Operator: +,-,*,/ ");
        String c= sc.next();
        System.out.print("Enter the Second Number:");
        int j= sc.nextInt();
        if(c.equals("+"))
        {
            System.out.print("Sum of Two Numbers:"+(i+j));
        }
        if(c.equals("-"))
        {
            System.out.print("Difference of Two Numbers:"+(i-j));
        }
        if(c.equals("*"))
        {
            System.out.print("Product of Two Numbers:"+(i*j));
        }
        if(c.equals("/"))
        {
            System.out.print("Quotient of Two Numbers:"+(i/j));
        }
    }
}
