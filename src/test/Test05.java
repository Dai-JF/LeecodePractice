package test;

/**
 * description:  找出链表的中间结点
 *
 * @author DaiJF
 * @date 2023/4/10 - 10:07
 */

// 先定义一个链表
class ListNode {
    // 节点的值
    int val;
    // 下一个结点
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("arr can not be empty");
        }
        this.val = nums[0];
        ListNode current = this;
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            s.append(cur.val);
            s.append(" -> ");
            cur = cur.next;
        }
        s.append("NULL");
        return s.toString();
    }
}


public class Test05 {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        //慢指针指向头节点
        ListNode slow = head;
        //快指针指向头节点
        ListNode fast = head;

        //当前快指针和快指针的下一个结点不为空，则继续前进
        while (fast != null && fast.next != null) {
            //慢指针每次走一格
            slow = slow.next;
            //快指针每次走两格
            fast = fast.next.next;
        }
        //快指针遍历完成，慢指针则在链表中间符合题意
        return slow;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {1, 2, 3, 4, 5, 6};
        ListNode head = new ListNode(arr);
        Test05 test05 = new Test05();
        System.out.println(test05.middleNode(head));

    }
}
