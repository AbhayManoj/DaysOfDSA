class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first=head;
        ListNode ptr=head;
        for(int i=0;i<n;i++)
        {
            ptr=ptr.next;
        }
        while(ptr.next!=null)
        {
            first=first.next;
            ptr=ptr.next;
        }
        first.next=first.next.next;
        return head;
    }
}