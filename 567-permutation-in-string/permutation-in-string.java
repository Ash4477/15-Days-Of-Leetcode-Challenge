class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        if (k > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        char[] str = s2.toCharArray();
        
        for (char c : s1.toCharArray()) {
            freq1[c-'a']++;
        }

        for (int i=0; i<k; i++) {
            freq2[str[i] - 'a']++;
        }

        if (Arrays.equals(freq1, freq2)) return true;


         for (int i=k; i<str.length; i++) {
            freq2[str[i] - 'a']++;
            freq2[str[i-k] - 'a']--;
            if (Arrays.equals(freq1, freq2)) return true;
        }

        return false;
    }
}