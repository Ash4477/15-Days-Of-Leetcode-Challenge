class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();

        for (char c: s.toCharArray()) {
            int size = res.length();
            if (size > 0 && res.charAt(size-1) == c) res.deleteCharAt(size-1);
            else res.append(c);
        }

        return res.toString();
    }
}