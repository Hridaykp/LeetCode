class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr = head, prev = null;
        while(curr != null){
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;  
        }
        return prev;
    }
}

// 1-> 2-> 3-> 4

// 4-> 3-> 2-> 1