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
    //Approach 1: Using char array and sorting : Time Complexity: O(n log n) and Space Complexity: O(n)
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
    /*
    Complexity Analysis: 
      The time complexity of this function is O(n log n), where n is the length of the input strings. This is because the function involves sorting the characters in the strings, which has a time complexity of O(n log n) for each string.
      The space complexity of this function is O(n), where n is the length of the input strings. This is because the function creates character arrays of the input strings, which have a space complexity of O(n) each.
    */

    //Approach 2: Using Arrays : Time Complexity: O(n) and Space Complexity: O(1)
    private static boolean isAnagram2(String str1, String str2) {
    //replace all white spaces and convert to lower case
    str1 = str1.replace(" ", "").toLowerCase();
    str2 = str2.replace(" ", "").toLowerCase();
    //check if length of both strings are equal
    if (str1.length() != str2.length()) {
      return false;
    }
    //create a frequency array for each string
    int[] frequencyArray1 = new int[26];
    int[] frequencyArray2 = new int[26];
    for (char c : str1.toCharArray()) {
      frequencyArray1[c - 'a']++;
    }
    for (char c : str2.toCharArray()) {
      frequencyArray2[c - 'a']++;
    }
    //compare the frequency arrays
    for (int i = 0; i < 26; i++) {
      if (frequencyArray1[i] != frequencyArray2[i]) {
        return false;
      }
    }
    return true;
  }
    /*
    Complexity Analysis:
        The time complexity of this function is O(n), where n is the length of the input strings. This is because the function iterates through the characters of the strings to build the frequency arrays.
        The space complexity of this function is O(1). This is because the function uses two integer arrays of fixed size (26) to store the frequency maps of the characters in the input strings, regardless of the length of the input strings.
    */
}
