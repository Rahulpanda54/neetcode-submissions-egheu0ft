

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
            
            int size = 0;

            ListNode curr = head;

            while(curr != null){
                size++;
                curr = curr.next;
            }

            if(size == n){
                return head.next;
            }

            int i=1;    curr = head;

            while(i < size-n){
                curr = curr.next;
                i++;
            }

            curr.next = curr.next.next;

            return head;
    }
}
