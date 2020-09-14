//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学 
// 👍 4878 👎 0


package com.shuzijun.leetcode.editor.cn;

import com.shuzijun.leetcode.editor.assist.ListNode;

import java.util.Objects;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode p = l1, q = l2, curr = dummyHead;
            int carry = 0;
            while (p != null || q != null) {
                int x = p != null ? p.getValue() : 0;
                int y = q != null ? q.getValue() : 0;
                int sum = x + y + carry;
                carry = sum / 10;
                curr.setNext(new ListNode(sum % 10));
                curr = curr.getNext();
                if(p!=null) p = p.getNext();
                if(q!=null) q = q.getNext();
            }
            if (carry > 0){
                curr.setNext(new ListNode(carry));
            }
            return dummyHead.getNext();

        }
//        public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
//            int i1 = getNumber(l1);
//            int i2 = getNumber(l2);
//            int result = i1 + i2;
//            StringBuilder sb = new StringBuilder(String.valueOf(result));
//            String numStr = sb.reverse().toString();
//            ListNode listNode = new ListNode(Integer.parseInt(String.valueOf(numStr.charAt(0))));
//            int i = 1;
//            while (i < numStr.length()) {
//                ListNode node = new ListNode();
//                node.setValue(Integer.parseInt(String.valueOf(numStr.charAt(i))));
//
//            }
//
//        }
//
//        private int getNumber(ListNode l) {
//            StringBuilder sb = new StringBuilder();
//            getNumber(l, sb);
//            return Integer.parseInt(sb.reverse().toString());
//        }
//
//        private void getNumber(ListNode l, StringBuilder sb) {
//            sb.append(l.getValue());
//            ListNode next = l.getNext();
//            if (l.getNext() != null) {
//                getNumber(next.getNext(), sb);
//            }
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}