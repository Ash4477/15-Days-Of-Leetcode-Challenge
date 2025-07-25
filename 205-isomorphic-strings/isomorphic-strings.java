class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sMap = new char[256];
        boolean[] tCheck = new boolean[256];

        int n = s.length();
        for (int i=0; i<n; i++) {
            if (sMap[s.charAt(i)] == 0) {
                if (tCheck[t.charAt(i)] == true) return false;
                sMap[s.charAt(i)] = t.charAt(i);
                tCheck[t.charAt(i)] = true;
            } else {
                if (sMap[s.charAt(i)] != t.charAt(i)) return false;
            }
        }
        return true;
    }
}