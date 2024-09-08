// 725. Split Linked List in Parts

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode temp1 = head;
        while(temp1 != null){
            size++;
            temp1 = temp1.next;
        }
        int equalparts = size / k;
        int remainingnodes = size % k;
        ListNode temp = head;
        ListNode prev = null;
        ListNode[] list = new ListNode[k];
        int j = 0;
        while(temp != null){
            list[j] = temp;j++;
            for(int i =0; i < equalparts; i++){
                prev = temp;
                temp = temp.next;
            }
            if(remainingnodes > 0){
                prev = temp;
                temp = temp.next;
                prev.next = null;
                remainingnodes--;
            }
            else{
                prev.next = null;
            }
        }
        return list;
    }
}