class Solution {
    public String reverseWords(String s) {
        String[] reverse = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i=reverse.length-1; i>=0; i--) {
            sb.append(reverse[i]);
            if (i!=0) sb.append(" ");
        }
        return sb.toString();
    }
}