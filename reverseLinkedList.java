class Solution {
    class ListNode{
        int val;
        ListNode next;
    }
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, next,prev=null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}