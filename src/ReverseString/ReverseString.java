package ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        String str= "codeSnippet";
        reverseUsingLoop(str);
        reverseUsingStringBuilder(str);
        reverseUsingTwoPointers(str);
    }
    private static void reverseUsingLoop(String str) {
        String nstr ="";
        for (int i = 0; i< str.length(); i++)
        {
            nstr= str.charAt(i)+nstr; //adds each character in front of the existing string
        }
        System.out.println("reverseUsingLoop: "
                + nstr);
    }
    private static void reverseUsingStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        // append a string into StringBuilder stringBuilder
        stringBuilder.append(str);

        // reverse StringBuilder stringBuilder
        stringBuilder.reverse();

        // print reversed String
        System.out.println("reverseUsingStringBuilder : "
                +stringBuilder);
    }
    private static void reverseUsingTwoPointers(String str) {
        char[] temArray = str.toCharArray();
        int left, right = 0;
        right = temArray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temArray[left];
            temArray[left] = temArray[right];
            temArray[right] = temp;
        }
        System.out.print("reverseUsingTwoPointers :");
        for (char c : temArray)
            System.out.print(c);
        System.out.println();
    }






}


