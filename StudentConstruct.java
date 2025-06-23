import java.util.Scanner;

public class StudentConstruct
{
    String name;
    int number;
    String branch;
    StudentConstruct()
    {
        this.name="Not Assigned";
        this.number=0;
        this.branch="Not Assigned";
    }
    StudentConstruct(String name, int number, String branch)
    {
        this.name=name;
        this.number=number;
        this.branch=branch;
    }
    StudentConstruct(String name, int number)
    {
        this.name=name;
        this.number=number;
        this.branch="Not Assigned";
    }
    public  void display()
    {
        System.out.println(this.name);
        System.out.println(this.number);
        System.out.println(this.branch);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your number:");
        int number = sc.nextInt();
        System.out.println("Enter your branch:");
        String branch = sc.next();
        StudentConstruct sc1 = new StudentConstruct();
        sc1.display();
        StudentConstruct sc2 = new StudentConstruct(name, number, branch);
        sc2.display();
        StudentConstruct sc3 = new StudentConstruct(name, number);
        sc3.display();
    }
}
