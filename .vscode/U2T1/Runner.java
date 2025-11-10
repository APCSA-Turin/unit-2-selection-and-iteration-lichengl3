import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();
        scan.close();

        int number = (int) (Math.random() * 6 + 1);
        if (number == 1) {
            System.out.println("yes");
        } 
        if (number == 2) {
            System.out.println("no");
        }
        if (number == 3) {
            System.out.println("probably not");
        }
        if (number == 4) {
            System.out.println("not possible");
        }
        if (number == 5) {
            System.out.println("maybe");
        }
        if (number == 6) {
            System.out.println("no clue");
        }
    }
}
