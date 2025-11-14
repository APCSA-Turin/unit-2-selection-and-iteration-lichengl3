import java.util.Scanner;

public class NumberInsanity {

    public NumberInsanity() {
    }

    public void go() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();
        String msg = result(num); // call helper method and store result
        System.out.println(msg);
        myScanner.close();
    }

    // helper method that returns string containing message to be printed
    private String result(int num) {
        if (num == 0) {
            return "That's not positive!";
        }

        if ((num % 2) == 1) {
            if (((num % 5) == 0) && ((num % 7) == 0)) {
                return "Divisible by 5 and 7!";
            }
            if ((num % 5) == 0) {
                return "Divisible by 5!";
            }
            if ((num % 7) == 0) {
                return "Divisible by 7!";
            } else {
                return "Not divisible by 5 or 7!";
            }
        }
        if ((num % 2) == 0) {
            if (num >= 100) {
                return "Big even number!";
            }
            if (num >= 50) {
                return "Medium even number!";
            } else {
                return "Small even number!";
            }
        }
        return "That's not positive!";
    }
}
