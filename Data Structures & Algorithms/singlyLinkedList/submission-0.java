class ListNode {  
    int val;
    ListNode next;

    // constructor
    // sets next to null by default
    public ListNode(int val) {
        this(val, null);
    }

    // accepts both value and next node
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    ListNode head;
    ListNode tail;

    // constructor
    // initialize with dummy node
    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    // return listnode at index or -1 if oob or list is empty
    public int get(int index) {
        ListNode curr = head.next;
        int i = 0;
        while (curr != null) {
            if (i == index) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    // insert new head
    public void insertHead(int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head.next;
        head.next = newHead;
        // if list was empty before newhead inserted
        if (newHead.next == null) {
            tail = newHead;
        }
    }

    // insert new node at end
    public void insertTail(int val) {
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        ListNode curr = this.head;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }

        // remove node ahead of curr
        // since i = index - 1
        if (curr != null && curr.next != null) {
            // if the node at index is the tail
            // set new tail to curr
            if (curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }

        return false;
    }

    // method to get the values of the linkedlist
    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = this.head.next;
        while (curr != null) {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }
}
