class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int p1=0;
        int p2=0;
        Set set = new HashSet<>();
        int len = 0;
        while (p2 < arr.length) {
            if (!set.contains(arr[p2])) {
                set.add(arr[p2]);
            } else {
                int newLen = p2 - p1;
                if (newLen > len) len = newLen;
                while (arr[p1] != arr[p2]) {
                    set.remove(arr[p1]);
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