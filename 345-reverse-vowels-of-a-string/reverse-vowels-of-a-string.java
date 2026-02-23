class Solution {
    public String reverseVowels(String s) {
        char[] wordArr = s.toCharArray();
        int left = 0;
        int right = wordArr.length-1;

        while (left < right) {
            while (left < right && !isVowel(wordArr[left])) left++;
            while (left < right && !isVowel(wordArr[right])) right--;
            if (left < right) {
                char temp = wordArr[left];
                wordArr[left++] = wordArr[right];
                wordArr[right--] = temp;
            }
        }

        return new String(wordArr);
    }

    public boolean isVowel(char c) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char v: vowels) {
            if (c == v) return true;
        }

        return false;
    }
}