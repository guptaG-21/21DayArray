link->https://leetcode.com/problems/rotate-list/?envType=study-plan-v2&envId=top-interview-150



 public ListNode rotateRight(ListNode head, int k) {
       if(head == null || head.next == null){
           return head;
       }
       ListNode help = head;
       int size = 1;
       while(help.next!=null){
           help = help.next;
           size++;
       }
       help.next = head;
       int rot = k%size;
       int skip = size-rot;
       ListNode newHead = head;
       for(int i=1;i<skip;i++){
           newHead = newHead.next;
       }
       head = newHead.next;
       newHead.next = null;
       return head;
    }