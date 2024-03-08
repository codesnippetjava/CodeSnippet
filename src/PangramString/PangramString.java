package PangramString;

public class PangramString {

        // Function to check if a string
        // contains all the letters from
        // a to z (ignoring case)
        public static void
        allLetter(String str)
        {
            // Converting the given string
            // into lowercase
            str = str.toLowerCase();

            boolean allLetterPresent = true;

            // Loop over each character itself
            for (char ch = 'a'; ch <= 'z'; ch++) {

                // Check if the string does not
                // contains all the letters
                if (!str.contains(String.valueOf(ch))) {
                    allLetterPresent = false;
                    break;
                }
            }

            // Check if all letter present then
            // print "Yes", else print "No"
            if (allLetterPresent)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        // Driver Code
        public static void main(String args[])
        {
            // Given string str
            String str = "Abcdefghijklmnopqrstuvwz12";

            // Function call
            allLetter(str);
        }

}
