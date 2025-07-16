import java.util.Scanner;

public class Expense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalIncome = 0.0, totalExpense = 0.0;
        int choice;

        while (true) {
            System.out.println("\n====== Expense Tracker Menu ======");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Income Amount: ₹");
                    double income = sc.nextDouble();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Income Description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter Income Date (DD-MM-YYYY): ");
                    String date = sc.nextLine();

                    totalIncome += income;
                    System.out.println(" Income added successfully.");
                }
                case 2 -> {
                    System.out.print("Enter Expense Amount: ₹");
                    double expense = sc.nextDouble();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Expense Description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter Expense Date (DD-MM-YYYY): ");
                    String date = sc.nextLine();

                    totalExpense += expense;
                    System.out.println(" Expense added successfully.");
                }
                case 3 -> {
                    double balance = totalIncome - totalExpense;
                    System.out.println(" Total Income: ₹" + totalIncome);
                    System.out.println(" Total Expense: ₹" + totalExpense);
                    System.out.println(" Current Balance: ₹" + balance);
                }
                case 4 -> {
                    System.out.println(" Exiting... Thank you for using the Expense Tracker!");
                    sc.close();
                    return;
                }
                default -> System.out.println(" Invalid choice. Please enter 1 to 4.");
            }
        }
    }
}
