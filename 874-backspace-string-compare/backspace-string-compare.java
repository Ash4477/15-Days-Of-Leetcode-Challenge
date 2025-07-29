class Solution {
    public boolean backspaceCompare(String s, String t) {
        String res1 = fn(s);
        String res2 = fn(t);
        return res1.equals(res2);
    }

    public String fn(String str) {
        Deque<Character> st = new ArrayDeque<>();
        int n = str.length();
        for (int i=0; i<n; i++) {
            char c = str.charAt(i);
            if (c != '#') st.push(c);
            else {
                if (!st.isEmpty()) st.pop();
            }
        }
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.toString();
    }
}