import java.util.Scanner;

public class ReverseString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.next();
        char[] arr = str.toCharArray();
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev += arr[i];
        }
        System.out.println("Reverse String: " + rev);
    }
}
