import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
    // Function to generate permutations
    public static List<String> generatePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permute(str, 0, str.length() - 1, permutations);
        return permutations;
    }

    // Helper function to recursively generate permutations
    private static void permute(String str, int l, int r, List<String> permutations) {
        if (l == r) {
            permutations.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, permutations);
                str = swap(str, l, i); // backtrack
            }
        }
    }

    // Function to swap characters in a string
    public static String swap(String a, int i, int j) {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String chars = "pro";
        List<String> words = generatePermutations(chars);

        // Print the list of permutations
        for (String word : words) {
            System.out.println(word);
        }
    }
}
