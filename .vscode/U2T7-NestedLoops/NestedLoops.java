public class NestedLoops {

    public NestedLoops() {
    }

    public static int maxBlock(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        char charBefore = str.charAt(0);
        char charNow;
        int highestCount = 1;
        int currentCount = 1;

        for (int i = 1; i < str.length(); i++) {
            charNow = str.charAt(i);
            if (charNow == charBefore) {
                currentCount++;
                if (currentCount > highestCount) {
                    highestCount = currentCount;
                }
            } else {
                currentCount = 1;
            }
            charBefore = str.charAt(i);
        }
        return highestCount;
    }
}
