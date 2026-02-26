class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] check = new boolean[256];
        char[] arr = s.toCharArray();
        int p1=0;
        int p2=0;
        int len = 0;
        while (p2 < arr.length) {
            if (!check[arr[p2]]) {
                check[arr[p2]] = true;
            } else {
                int newLen = p2 - p1;
                if (newLen > len) len = newLen;
                while (arr[p1] != arr[p2]) {
                    check[arr[p1]] = false;
                    p1++;
                }
                p1++;
            }
            p2++;
        }
        int newLen = p2 - p1;
        if (newLen > len) len = newLen;
        return len;
    }
}