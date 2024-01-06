link->https://leetcode.com/problems/reverse-linked-list-ii/description/?envType=study-plan-v2&envId=top-interview-150




public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode start, end;
        start = new ListNode();
        start.next = head;
        for(int i = 0; i< left-1 && start != null; i++){
            start = start.next;
        }
        end = start;
        for(int i = left; i<=right && end != null; i++) {
            end = end.next;
        }
        ListNode s = start.next, e = end;
        end = end.next;
        ListNode prev = null, curr = s;
        while(curr != end){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        s.next = end;
        start.next = e;
        return head == s ? e : head;
    }