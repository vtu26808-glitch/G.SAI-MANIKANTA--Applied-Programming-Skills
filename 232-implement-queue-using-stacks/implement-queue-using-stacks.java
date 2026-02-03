class MyQueue {
    Stack<Integer> st;
    Stack<Integer> s2;

    public MyQueue() {
        st = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(!st.isEmpty()) s2.push(st.pop());
        int remove_last_from_s2 = s2.pop();
        while(!s2.isEmpty()) st.push(s2.pop());
        return remove_last_from_s2;
    }
    
    public int peek() {
        while(!st.isEmpty()) s2.push(st.pop());
        int remove_last_from_s2 = s2.peek();
        while(!s2.isEmpty()) st.push(s2.pop());
        return remove_last_from_s2;
    }
    
    public boolean empty() {
        return st.isEmpty() == s2.isEmpty();
    }
}
