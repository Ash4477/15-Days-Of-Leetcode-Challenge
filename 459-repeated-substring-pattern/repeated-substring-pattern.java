class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String subStr = "";
        int n = s.length();
        for (int i=0; i<n/2; i++) {
            subStr += s.charAt(i);
            if (n % subStr.length() != 0) continue;
            String tempStr = subStr;
            while(tempStr.length() < n) {
                tempStr += subStr;
            }
            if (tempStr.equals(s)) return true;
        }
        return false;
    }
}