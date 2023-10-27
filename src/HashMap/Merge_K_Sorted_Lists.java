package HashMap;


// Definition for singly-linked list.


import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_K_Sorted_Lists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        int[][] lists = {{1,4,5},{1,3,4},{2,6}};
        public ListNode mergeKLists(ListNode[] lists) {

            PriorityQueue<ListNode> q = new PriorityQueue<>(new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    return o1.val-o2.val;
                }
            });
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null) {
                    q.add(lists[i]);
                }
            }
            ListNode Dummy = new ListNode();
            ListNode temp = Dummy;
            while(q.size()!=0){
                ListNode rv=q.poll();
                Dummy.next=rv;
                if(rv.next!=null){
                    q.add(rv);
                }
                Dummy=Dummy.next;
            }
        }
    }

}
