class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode front_N = head, back_N = head;
        for(int i=1; i<k; i++)
            front_N = front_N.next;
        
        ListNode curr = front_N;
        while(curr.next != null){
            curr = curr.next;
            back_N = back_N.next;
        }
        int t = front_N.val;
        front_N.val = back_N.val;
        back_N.val = t;
        return head;
    }
}