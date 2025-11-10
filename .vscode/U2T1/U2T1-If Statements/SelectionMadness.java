public class SelectionMadness {

    public SelectionMadness() {
    }

    /*
     * Returns 1 of 5 randomly generated fortunes as a string;
     * you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
        int number = (int) (Math.random() * 5) + 1;
        if (number == 1) {
            return "good luck";
        }
        if (number == 2) {
            return "bad luck";
        }
        if (number == 3) {
            return "extremely good luck";
        }
        if (number == 4) {
            return "extremely bad luck";
        }
        return "mediocre luck";
    } 

    /*
     * Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }
}
