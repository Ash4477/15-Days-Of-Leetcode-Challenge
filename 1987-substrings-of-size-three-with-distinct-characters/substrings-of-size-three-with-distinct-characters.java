class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;

        char[] arr = s.toCharArray();
        int count = 0;
        for (int i=2; i<arr.length; i++) {
            if (arr[i] != arr[i-1] && arr[i-1] != arr[i-2] && arr[i] != arr[i-2]) count++;
        }

        return count;
    }
}