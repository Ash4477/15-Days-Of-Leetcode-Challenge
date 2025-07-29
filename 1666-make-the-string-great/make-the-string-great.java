class Solution {
    public String makeGood(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && Math.abs(st.peek() - c) == 32) st.pop();
            else st.push(c);
        }

        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()){
            res.insert(0, st.pop());
        }

        return res.toString();
    }
}