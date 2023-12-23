import java.util.Scanner;
//Add switches & infinite loop

public class Calculatorswitch {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
            while (true) {

                System.out.println("Ready To Calculate");
                System.out.println("  ");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("0. Exit");
                System.out.println("  ");
                System.out.println("Enter your choice: ");


                int choice = S.nextInt();

                if (choice == 0) {
                    System.out.println("Exited the Calculator");
                    break;
                }

                System.out.print("Enter the first number: ");
                double num1 = S.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = S.nextDouble();

                double result = 0;

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("  ");
                        System.out.println("Result: " + result);
                        System.out.println("  ");
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("  ");
                        System.out.println("Result: " + result);
                        System.out.println("  ");
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("  ");
                        System.out.println("Result: " + result);
                        System.out.println("  ");
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("  ");
                            System.out.println("Result: " + result);
                            System.out.println("  ");
                        } else {
                            System.out.println("  ");
                            System.out.println("Error: Division by zero is not allowed, Try Again!");
                            System.out.println("  ");
                        }
                        break;
                    default:
                        System.out.println("  ");
                        System.out.println("Invalid choice. Please enter a valid option.");
                        System.out.println("  ");
            }
        }
            S.close();
    }
}
