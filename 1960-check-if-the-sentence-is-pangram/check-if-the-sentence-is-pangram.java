class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] check = new boolean[26];
        int n = sentence.length();
        for (int i=0; i<n; i++) {
            check[sentence.charAt(i) - 'a'] = true;
        }

        for (int i=0;  i<26; i++) {
            if (!check[i]) return false;
        }
        return true;
    }
}