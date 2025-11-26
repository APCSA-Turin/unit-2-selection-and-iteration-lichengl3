public class WhileLoopFun {

    public WhileLoopFun() {
    }

    public void printDigits(int number) {
        StringBuilder build = new StringBuilder();

        int resultLength = 0;
        int thing = 1;
        while (Integer.toString(number).length() - 1 >= resultLength) {
            build.append(
                    Character.toString(Integer.toString(number).charAt(Integer.toString(number).length() - thing)));
            if (!(resultLength >= Integer.toString(number).length() - 1)) {
                build.append("\n");
            }
            thing++;
            resultLength++;
        }
        System.out.println(build.toString());
    }

    public int countLetter(String word, String letter) {
        int tries = 0;
        int matches = 0;
        while (word.length() - 1 >= tries) {
            if (letter.equals(Character.toString(word.charAt(tries)))) {
                matches++;
            }
        tries++;
        }
    return matches;
    }

    public int maxDoubles(int number, int threshold) {
        int count = 0;
        while (number <= threshold) {
            number *= 2;
            if (number > threshold) {
                break;
            }
            count++;
        }
        return count;
    }

    public boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        int counter = 1;
        int divisible = 0;
        while (counter <= number) {
            if (number % counter == 0) {
                divisible++;
            }
        counter++;
        }
        if (divisible == 2) {
            return true;
        } else {
            return false;
        }
    }
}
