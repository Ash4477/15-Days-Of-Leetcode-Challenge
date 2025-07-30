class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (st.isEmpty()) st.push(c);
            else if (st.peek() == '(' && c == ')') st.pop();
            else st.push(c);
        }

        return st.size();
    }
}