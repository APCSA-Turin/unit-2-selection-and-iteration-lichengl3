public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }
        for (int i = 15; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 15; i > -1; i--) {
            System.out.println(i);
        }
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
