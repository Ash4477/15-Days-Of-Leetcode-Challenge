class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();
        int idx1 = 0;
        int idx2 = 0;
        StringBuilder sb = new StringBuilder();

        while (idx1 < word1Arr.length && idx2 < word2Arr.length) {
            sb.append(word1Arr[idx1++]);
            sb.append(word2Arr[idx2++]);
        }

        while (idx1 < word1Arr.length) {
            sb.append(word1Arr[idx1++]);
        }

        while (idx2 < word2Arr.length) {
            sb.append(word2Arr[idx2++]);
        }

        return sb.toString();
    }
}