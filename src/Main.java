import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculating project! ");
        System.out.println("Please enter two numbers! ");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("please select an operation \n");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        double result = 0.0;

        switch (choice){

            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0){
                    result = num1 / num2;
                }
                else {
                    System.out.println("Error: division by zero!");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Invalide operation choice.");
                System.exit(1);

        }

        System.out.println("Result: " + result);


    }
}