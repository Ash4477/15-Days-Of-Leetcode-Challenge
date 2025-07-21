class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i=n/2; i>=1; i--) {
            if (n % i != 0) continue;
            String subStr = s.substring(0, i);
            StringBuilder tempStr = new StringBuilder(subStr);
            while(tempStr.length() < n) {
                tempStr.append(subStr);
            }
            if (tempStr.toString().equals(s)) return true;
        }
        return false;
    }
}