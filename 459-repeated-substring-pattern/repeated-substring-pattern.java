class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i=n/2; i>=1; i--) {
            if (n % i != 0) continue;
            String subStr = s.substring(0, i);
            StringBuilder tempStr = new StringBuilder();
            int repeats = n / i;
            for (int j=0; j<repeats; j++) {
                tempStr.append(subStr);
            }
            if (tempStr.toString().equals(s)) return true;
        }
        return false;
    }
}