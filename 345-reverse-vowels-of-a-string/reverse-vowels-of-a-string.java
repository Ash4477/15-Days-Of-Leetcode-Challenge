class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        StringBuilder res = new StringBuilder(s);

        while (left < right) {
            while (left < right && !isVowel(s.charAt(left))) left++;
            while (left < right && !isVowel(s.charAt(right))) right--;
            res.setCharAt(left, s.charAt(right));
            res.setCharAt(right, s.charAt(left));
            left ++; right--;
        }

        return res.toString();
    }

    public boolean isVowel(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') return true;
        else return false;
    }
}