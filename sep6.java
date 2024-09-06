//3217. Delete Nodes From Linked List Present in Array
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { 
        this.val = val; 
        }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i < nums.length; i++){
            set.add(nums[i]);
        }
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        ListNode temp2 = head;
        while(temp2 != null){
            if(!set.contains(temp2.val)){
                temp.next = temp2;
                temp = temp.next;
            }
            temp2 = temp2.next;
        }
        temp.next = null;
        return ans.next;
    }
}