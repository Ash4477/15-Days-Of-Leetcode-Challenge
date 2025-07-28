class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int resIdx = -1;

        for (int i=0; i<n; i++) {
            if (word.charAt(i) == ch) {
                resIdx = i;
                break;
            }
        }

        if (resIdx == -1) return word;

        StringBuilder res = new StringBuilder(word);
        for (int i=0; i<=resIdx; i++) {
            res.setCharAt(i, word.charAt(resIdx-i));
            res.setCharAt(resIdx-i, word.charAt(i));
        }

        return res.toString();
    }
}