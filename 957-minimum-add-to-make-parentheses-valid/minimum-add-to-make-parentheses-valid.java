class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(c);
            else if (st.isEmpty()) count++;
            else st.pop();
        }

        return count+st.size();
    }
}