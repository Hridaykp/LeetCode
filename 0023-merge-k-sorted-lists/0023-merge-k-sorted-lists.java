class Solution {
    private static ListNode merged2(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val){
            l1.next=merged2(l1.next,l2);
            return l1;
        }
        else{
            l2.next=merged2(l1,l2.next);
            return l2;
        }
    }
    private static ListNode divideconq(ListNode[] lists,int s,int e){
        if(s>e) return null;
        if(s==e) return lists[s];
            int p=(s+e)/2;
            ListNode l1=divideconq(lists,s,p);
            ListNode l2=divideconq(lists,p+1,e);
            return merged2(l1,l2);   
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        return divideconq(lists,0,k-1) ;      
        
    }
}