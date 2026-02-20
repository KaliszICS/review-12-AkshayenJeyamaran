public class PracticeProblem {
    public static boolean isPalindrome(String word) {
        if (word == null) return false;

        // Remove spaces and convert to lowercase
        String cleaned = word.replace(" ", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static int getAge(String[] names, int[] ages, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return ages[i];
            }
        }
        return -1; 
    }

    public static int countWords(String text, char letter) {
        if (text == null || text.isEmpty()) return 0;

        String[] words = text.split("\\s+");
        int count = 0;
        char target = Character.toLowerCase(letter);

        for (String word : words) {
            if (word.toLowerCase().indexOf(target) != -1) {
                count++;
            }
        }

        return count;
    }
}