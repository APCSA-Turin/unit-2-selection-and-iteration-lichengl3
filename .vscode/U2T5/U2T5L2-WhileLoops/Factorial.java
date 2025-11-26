import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number do you want to factorial? ");
        System.out.print("Enter a number between 0 and 170: ");
        int userNumber = scanner.nextInt();

        while (userNumber < 0 || userNumber > 170) {
            System.out.print("No! Between 0 and 170: ");
            userNumber = scanner.nextInt();
        }

        int num = userNumber;
        double factorialResult = 1;
        while (num > 0) {
            factorialResult *= num;
            num--;
        }
        System.out.println(userNumber + "! is " + factorialResult);
        scanner.close();
    }
}