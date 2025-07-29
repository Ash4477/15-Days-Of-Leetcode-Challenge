class Solution {
    public String makeGood(String s) {
        StringBuilder res = new StringBuilder(s);
        int len = s.length();
        int i=1;

        while (i<len) {
            char c1 = res.charAt(i);
            char c2 = res.charAt(i-1);
            if ( (c1 == c2 + 32) || (c1 == c2-32) ) {
                res.delete(i-1, i+1);
                len = res.length();
                i=1;
            } else i++;
        }
        return res.toString();
    }
}