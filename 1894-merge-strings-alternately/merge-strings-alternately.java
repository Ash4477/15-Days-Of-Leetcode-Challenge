class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";

        int i;
        for (i=0; i<word1.length() && i<word2.length(); i++) {
            result += word1.charAt(i);
            result += word2.charAt(i);
        }

        while (i < word1.length()) {
            result += word1.charAt(i++);
        }

        while (i < word2.length()) {
            result += word2.charAt(i++);
        }

        return result;
    }
}