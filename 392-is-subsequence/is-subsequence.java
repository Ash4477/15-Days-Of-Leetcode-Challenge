class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPoint = 0;
        int tPoint = 0;
        int n1 = s.length();
        int n2 = t.length();
        while (sPoint < n1 && tPoint<n2 ) {
            if (s.charAt(sPoint) == t.charAt(tPoint)) {
                sPoint++;
                tPoint++;
            } else {
                tPoint++;
            }
        }

        if (sPoint == n1) return true;
        return false;
    }
}