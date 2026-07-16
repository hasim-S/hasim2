public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        if (s == null || s.next == null || f.next.next == null) {
            return false;
        }

        s = s.next;
        f = f.next.next;

        while (f != s) {
            if (f == null || f.next == null) {
                return false;
            }

            s = s.next;
            f = f.next.next;
        }

        return true;
    }
}