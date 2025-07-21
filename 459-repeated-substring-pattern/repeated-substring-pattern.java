class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String subStr = "";
        for (int i=0; i<s.length()-1; i++) {
            subStr += s.charAt(i);
            String tempStr = subStr;
            while(tempStr.length() < s.length()) {
                tempStr += subStr;
            }
            if (tempStr.equals(s)) return true;
        }
        return false;
    }
}