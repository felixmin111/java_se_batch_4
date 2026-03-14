import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        System.out.println("""
        Choose a process
        1. Add
        2. Subtract
        3. Multiply
        4. Divide
        """);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        if (choice == 1) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (choice == 2) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (choice == 3) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (choice == 4) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        else {
            System.out.println("Invalid choice or invalid number");
        }
        sc.close();
    }
}
