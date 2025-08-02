class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qu = new LinkedList<>();

       for (int i=sandwiches.length-1; i>=0;i--) {
            st.push(sandwiches[i]);
        }
        
        for (int i : students) {
            qu.add(i);
        }

        int count = qu.size();
        while (!qu.isEmpty() && !st.isEmpty()) {
            if (count <= 0) return qu.size();
            if (st.peek() == qu.peek()) {
                st.pop();
                qu.poll();
                count = qu.size();
            }
            else {
                qu.add(qu.poll());
                count--;
            }
        }

        return qu.size();
    }
}