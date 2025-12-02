public class StringLoops {
    public StringLoops() {
    }

    public int countCharacters(String character, String searchString) {
        int amount = 0;
        for (int i = 0; i < searchString.length(); i++) {
            if (character.charAt(0) == searchString.charAt(i)) {
                amount++;
            }
        }
        if (Character.isUpperCase(character.charAt(0))) {
            for (int i = 0; i < searchString.length(); i++) {
                if (character.toLowerCase().charAt(0) == searchString.charAt(i)) {
                    amount++;
                }
            }
        }
        if (Character.isLowerCase(character.charAt(0))) {
            for (int i = 0; i < searchString.length(); i++) {
                if (character.toUpperCase().charAt(0) == searchString.charAt(i)) {
                    amount++;
                }
            }
        }
        return amount;
    }

    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
