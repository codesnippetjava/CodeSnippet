package FascinaingNumber;

public class FascinatingNumber {
    public static void main(String[] args) {
        int num =327, n2, n3;

        n2 = num * 2;
        n3 = num * 3;
//concatenating num, n2, and n3
        String concatStr = num + "" + n2 + n3;
        boolean found = true;
//checks all digits from 1 to 9 are present or not
        for(char c = '1'; c <= '9'; c++)
        {
            int count = 0;
//loop counts the frequency of each digit
            for(int i = 0; i < concatStr.length(); i++)
            {
                char ch = concatStr.charAt(i);
//compares the character of concatStr with i
                if(ch == c)
//incerments the count by 1 if the specified condition returns true
                    count++;
            }
//returns true if any of the condition returns true
            if(count > 1 || count == 0)
            {
                found = false;
                break;
            }
        }
        if(found)
            System.out.println(num + " is a fascinating number.");
        else
            System.out.println(num + " is not a fascinating number.");
    }
}

