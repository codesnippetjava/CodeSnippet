package Anagram;

import java.util.Arrays;

public class AnagramDemo {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = checkAnagram(str1, str2);

        if (areAnagrams) {
            System.out.println
                    (str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println
                    (str1 + " and " + str2 + " are not anagrams.");
        }
    }
    public static boolean checkAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        // Remove spaces and convert to lowercase for comparison
        str1 = str1.replaceAll
                ("\\s", "").toLowerCase();
        str2 = str2.replaceAll
                ("\\s", "").toLowerCase();

        // Convert strings to character arrays, sort them, and compare
        return Arrays.equals(
                str1.chars().sorted().toArray(),
                str2.chars().sorted().toArray()
        );
    }

}
