class Solution 
 {
    public boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U');
    }

    public String reverseVowels(String s) 
    {
        char[] res = s.toCharArray();
        int left = 0;
        int right = res.length-1;

        while (left < right) {
            if (!isVowel(res[left])) left++;
            
            if (!isVowel(res[right])) right--;

            if (isVowel(res[left]) && isVowel(res[right])) {
                char temp = res[left];
                res[left++] = res[right];
                res[right--] = temp;
            }
        }
        return new String(res);
    }
  }