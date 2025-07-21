class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder subStr = new StringBuilder();
        int n = s.length();
        for (int i=0; i<n/2; i++) {
            subStr.append(s.charAt(i));
            if (n % subStr.length() != 0) continue;
            StringBuilder tempStr = new StringBuilder(subStr);
            while(tempStr.length() < n) {
                tempStr.append(subStr);
            }
            if (tempStr.toString().equals(s)) return true;
        }
        return false;
    }
}