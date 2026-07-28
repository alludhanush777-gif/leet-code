
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null){
            if(fast.next==null){
                return slow;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}