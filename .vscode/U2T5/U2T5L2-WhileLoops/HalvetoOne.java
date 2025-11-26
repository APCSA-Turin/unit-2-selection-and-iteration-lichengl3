import java.util.Scanner;

public class HalvetoOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to halve to one? ");
        int userNumber = scanner.nextInt();
        int temp = userNumber;
        int numHalvings = 0;

        while (temp > 1) {
            temp = temp / 2;
            System.out.println(temp);
            numHalvings++;
        }
        System.out.println("It takes " + numHalvings + " halvings to get from " + userNumber + " to 1.");
        scanner.close();
    }
}