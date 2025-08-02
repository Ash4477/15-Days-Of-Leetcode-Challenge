class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        if (q1.isEmpty()) return -1;
        while (!q1.isEmpty()) {
            int x = q1.poll();
            if (q1.isEmpty()) {
                while (!q2.isEmpty()) q1.add(q2.poll());
                return x;
            }
            else q2.add(x);
        }
        return -1;
    }
    
    public int top() {
        if (q1.isEmpty()) return -1;
        while (!q1.isEmpty()) {
            int x = q1.poll();
            q2.add(x);
            if (q1.isEmpty()) {
                while (!q2.isEmpty()) q1.add(q2.poll());
                return x;
            }
        }
        return -1;
    }
    
    public boolean empty() {
        return (q1.isEmpty());
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */