class Solution {
       public boolean isGoodString(String word, int[] count) {
            for (char c: word.toCharArray()) {
                if (count[c - 'a'] <= 0) return false;
                count[c - 'a']--;
            }
            return true;
        }
    public int countCharacters(String[] words, String chars) {
        int res = 0;
        int[] count = new int[26];

        for (char c: chars.toCharArray()) {
            count[c - 'a']++;
        }

        for (String word: words) {
            int[] tempCount = Arrays.copyOf(count, 26);
            if (isGoodString(word, tempCount)) res+=word.length();
        }
        return res;
    }
}
