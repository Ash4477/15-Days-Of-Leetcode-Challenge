class Solution 
 {
    public boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U');
    }

    public String reverseVowels(String s) 
    {
        StringBuilder res = new StringBuilder(s);
        int left = 0;
        int right = s.length()-1;

        while (left < right) {
            if (!isVowel(s.charAt(left))) left++;
            
            if (!isVowel(s.charAt(right))) right--;

            if (isVowel(s.charAt(left)) && isVowel(s.charAt(right))) {
                char temp = s.charAt(left);
                res.setCharAt(left++, s.charAt(right));
                res.setCharAt(right--, temp);
            }
        }
        return res.toString();
    }
  }