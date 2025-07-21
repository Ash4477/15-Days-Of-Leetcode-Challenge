class Solution {
    public boolean isAlphaNumeric(char c) {
        if ((c >= 48 && c <=57) || (c >= 97 && c <=122)) return true;
        else return false;
    }

    public boolean isPalindrome(String s) {
        int left = 0;   
        int right = s.length() - 1;
        s = s.toLowerCase();

        while(left < right) {
            while (left < right && !isAlphaNumeric(s.charAt(left))) left++;
            while (left < right && !isAlphaNumeric(s.charAt(right))) right--;

            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }   
}