class ListNode {
    ListNode next;
    ListNode prev;
    String url;

    public ListNode(String url) {
        this.next = null;
        this.prev = null;
        this.url = url;
    }
}

class BrowserHistory {
    private ListNode head;

    public BrowserHistory(String homepage) {
        head = new ListNode(homepage);
    }
    
    public void visit(String url) {
        ListNode newLink = new ListNode(url);
        head.next = newLink;
        newLink.prev = head;
        head = newLink;
    }
    
    public String back(int steps) {
        for (int i=0; i<steps; i++) {
            if (head.prev == null) break;
            head = head.prev;
        }

        return head.url;
    }
    
    public String forward(int steps) {
         for (int i=0; i<steps; i++) {
            if (head.next == null) break;
            head = head.next;
        }

        return head.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */