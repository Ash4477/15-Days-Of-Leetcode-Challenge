class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] check = new boolean[26];

        for (char c: sentence.toCharArray()) {
            check[c - 'a'] = true;
        }

        for (boolean ch: check) {
            if (!ch) return false;
        }

        return true;
    }
}