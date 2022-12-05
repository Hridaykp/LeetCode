class Solution {
    private ListNode reverse(ListNode head){
        if(head == null || head.next==null) return head;
        ListNode rest = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
    private void merged(ListNode a, ListNode b){
        while(a!=null && b!=null){
            ListNode newNode = b;
            b = b.next;
            ListNode nextA = a.next;
            a.next = newNode;
            if(nextA!=null) newNode.next = nextA;
            a = nextA;
        }
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head, fast = head, prev = head;
        while(fast!=null && fast.next !=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode L1 = head;
        ListNode L2 = reverse(slow);
        
        merged(L1,L2);
    }
}

//  1 -> 2

//  4 -> 3