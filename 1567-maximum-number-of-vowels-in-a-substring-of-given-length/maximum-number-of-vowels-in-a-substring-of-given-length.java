class Solution {
    public int maxVowels(String s, int k) {
        char[] word = s.toCharArray();
        int maxCount = 0;
        for (int i=0; i<k; i++) {
            if (isVowel(word[i])) maxCount++;
        }

        int currCount = maxCount;
        for (int i=k; i<word.length; i++) {
            if (isVowel(word[i-k])) currCount--;
            if (isVowel(word[i])) currCount++;
            if (currCount > maxCount) maxCount = currCount;
        }

        return maxCount;
    }

    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        return false;
    }
}