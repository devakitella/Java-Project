package Assignment;

public class StringsMerge {
    public static String mergeAlternately(String word1, String word2) {
        String mergedString = "";
        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            mergedString += word1.charAt(i);
            mergedString += word2.charAt(j);
            i++;
            j++;
        }

        if (i < word1.length()) {
            mergedString += word1.substring(i);
        }
        if (j < word2.length()) {
            mergedString += word2.substring(j);
        }

        return mergedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
    }
}
