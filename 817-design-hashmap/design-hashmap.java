class ListNode {
    int key;
    int val;
    ListNode next;

    ListNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.next = null;
    }
}

class MyHashMap {
    private ListNode[] data;
    private int size;
    
    public MyHashMap() {
        size = 769;
        data = new ListNode[size];
    }
    
    public void put(int key, int value) {
        int hashKey = key % size;
        if (data[hashKey] == null) {
            data[hashKey] = new ListNode(key, value);
        }
        else {
            ListNode curr = data[hashKey];
            while (true) {
                if (curr.key == key) {
                    curr.val = value;
                    return;
                }
                if (curr.next == null) break;
                curr = curr.next;
            }
            curr.next = new ListNode(key, value); 
        }
    }
    
    public int get(int key) {
        int hashKey = key % size;
        ListNode curr = data[hashKey];
        while (curr != null) {
            if (curr.key == key) return curr.val;
            curr = curr.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        int hashKey = key % size;
        ListNode curr = data[hashKey];

        if (curr == null) return;

        if (curr.key == key) {
            if (curr.next != null) data[hashKey] = curr.next;
            else data[hashKey] = null;
            return;
        }

        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */