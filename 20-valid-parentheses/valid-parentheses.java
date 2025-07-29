class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int n = s.length();

        for (int i=0; i<n; i++) {
            char c = s.charAt(i);
            if (c == '(') st.push(')');
            else if (c == '{') st.push('}');
            else if (c == '[') st.push(']');
            else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if (top != s.charAt(i)) return false;
            }
        }
        return st.isEmpty();
    }
}