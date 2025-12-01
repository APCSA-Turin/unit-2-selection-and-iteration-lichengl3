import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class D1 {

    public static int dial = 50;
    public static int zeros = 0;
    public static int rotations2 = 0;
    public static int rotations = 0;

    public static void main(String[] args) {
        ArrayList<String> lines = getFileData("src/data");

        int partOneAnswer = 0;
        int partTwoAnswer = 0;
        for (int i = 0; i < lines.size(); i++) {
            partOneAnswer = getPartOneNumber(lines.get(i));
            partTwoAnswer = getPartTwoNumber(lines.get(i));
        }

        System.out.println("Part one answer: " + partOneAnswer);
        System.out.println("Part two answer: " + partTwoAnswer);
    }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals("")) fileData.add(line);
            }
            return fileData;
        } catch (FileNotFoundException e) {
            return fileData;
        }
    }

    public static int getPartOneNumber(String line) {
       /* if (line.charAt(0) == 'L') {
            dial -= Integer.parseInt(line.substring(1));
        }
        if (line.charAt(0) == 'R') {
            dial += Integer.parseInt(line.substring(1));
        }
        while (dial > 99) {
            dial -= 100;
        }
        while (dial < 0) {
            dial += 100;
        }
        System.out.println(dial);
        if (dial == 0) {
            zeros++;
        }
        return zeros;
        */
        return 0;
    }


    public static int getPartTwoNumber(String line) {
        if (line.charAt(0) == 'L') {
            dial -= Integer.parseInt(line.substring(1));
        }
        if (line.charAt(0) == 'R') {
            dial += Integer.parseInt(line.substring(1));
        }
        if (dial == 0) {
            zeros++;
        } else {
            while (dial > 99) {
                dial -= 100;
                rotations2++;
                if (dial == 0) {
                    zeros++;
                    break;
                }
                if (dial > 99) {
                    zeros++;
                }
                if (dial < 100 && rotations2 == 1) {
                    zeros++;
                }
            }
            while (dial < 0) {
                dial += 100;
                rotations++;
                if (dial == 0) {
                    zeros++;
                    break;
                }
                if (dial < 0) {
                    zeros++;
                }
                if (dial > 0 && rotations == 1) {
                    zeros++;
                }
            }
        }

        rotations = 0;
        rotations2 = 0;
        System.out.println(zeros);
        return zeros;
    }
}