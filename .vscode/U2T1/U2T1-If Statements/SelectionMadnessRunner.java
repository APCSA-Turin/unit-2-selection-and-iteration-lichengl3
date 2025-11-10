public class SelectionMadnessRunner {
    public static void main(String[] args) {
        
        SelectionMadness madness = new SelectionMadness();
        
        // test fortune
        System.out.println("---- testing fortune ----");
        System.out.println(madness.fortune());
        System.out.println(madness.fortune());
        System.out.println(madness.fortune());
        System.out.println(madness.fortune());
        System.out.println(madness.fortune());

        // test largest
        System.out.println("\n---- testing largest ----");
        System.out.println(madness.largest(5, 8, 3));
        System.out.println(madness.largest(8, 5, 3));
        System.out.println(madness.largest(3, 5, 8));
        System.out.println(madness.largest(-5, -8, -3));
        System.out.println(madness.largest(11, 11, 10));
    }
}