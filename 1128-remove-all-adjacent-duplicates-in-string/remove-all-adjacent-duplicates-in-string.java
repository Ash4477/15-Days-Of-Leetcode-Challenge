class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();

        for (char c: s.toCharArray()) {
            if (st.isEmpty()) st.push(c);
            else if (c != st.peek()) st.push(c);
            else st.pop();
        }

        while (!st.isEmpty()) {
            res.insert(0, st.pop());
        }

        return res.toString();
    }
}