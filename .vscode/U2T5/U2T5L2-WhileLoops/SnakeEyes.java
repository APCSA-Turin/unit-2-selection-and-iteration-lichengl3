public class SnakeEyes {
    public static void main(String[] args) {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int rollNum = 1;
        System.out.println("Roll #" + rollNum + ": " + dice1 + " and " + dice2);

        while (dice1 != 1 || dice2 != 1) {
            System.out.println("Not snake eyes, rolling again!");
            rollNum++;
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            System.out.println("Roll #" + rollNum + ": " + dice1 + " and " + dice2);
        }
        System.out.println("Finally, snake eyes!");
    }
}
