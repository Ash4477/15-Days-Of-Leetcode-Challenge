class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        int n = sentence.length();
        for (int i=0; i<n; i++) {
            set.add(sentence.charAt(i));
        }

        return set.size() == 26;
    }
}