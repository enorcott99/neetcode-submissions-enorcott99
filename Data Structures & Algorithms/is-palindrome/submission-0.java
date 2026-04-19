// import static java.lang.Character.*;

class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return false;
        }

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            // find next letter / num on left side
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            // find next letter / num on right side
            while (j > i && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            // if they don't match, not palindrome
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            
            i++;
            j--;
        }
        return true;
    }
}
