

class Solution {

    public void reorderList(ListNode head) {
        
        if(head == null){
            return;
        }

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        ListNode first = head;
        ListNode mid = middle(head);

        ListNode sec  =  reverse(mid.next);

        mid.next = null;

        while(sec != null){
            
            temp.next = first;
            temp = first;
            first = first.next;


            temp.next = sec;
            temp = sec;
            sec = sec.next;

        }

        if(first != null){
            temp.next = first;
        }

         head = dummy.next;
    }

    public ListNode middle(ListNode head){

        if(head == null){
            return null;
        }

        ListNode hare = head;
        ListNode turtle = head;

        while(hare != null && hare.next != null){

            turtle = turtle.next;
            hare = hare.next.next;

        }

        return turtle;
    }

    public ListNode reverse(ListNode head){

        if(head == null){
            return null;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        while(curr != null){

            ListNode nextnode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }

        head.next = null;
        head = prev;

        return head;

    }
}
