class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i;
        for (i=0; i<word1.length() && i<word2.length(); i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        while (i < word1.length()) {
           result.append(word1.charAt(i++));
        }

        while (i < word2.length()) {
            result.append(word2.charAt(i++));
        }

        return result.toString();
    }
}