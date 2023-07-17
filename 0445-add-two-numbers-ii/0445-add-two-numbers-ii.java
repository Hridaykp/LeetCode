class Solution {
    private static ListNode reverseLL(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newhead = reverseLL(head.next);
		head.next.next = head;
		head.next = null;

		return newhead;
	}
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
		ListNode temp = dummy;
		ListNode rev1 = reverseLL(l1);
		ListNode rev2 = reverseLL(l2);
		int carry = 0;
		while (rev1 != null || rev2 != null || carry == 1) {

			int sum = 0;
			if (rev1 != null) {
				sum = sum + rev1.val;
				rev1 = rev1.next;// 3 6 5
			}
			if (rev2 != null) {
				sum = sum + rev2.val;
				rev2 = rev2.next;
			}
			sum = sum + carry;
			carry = sum / 10;
			temp.next = new ListNode(sum % 10);
			temp = temp.next;
		}
		return reverseLL(dummy.next);
	}
    
}