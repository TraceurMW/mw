package com.mw.Study.Leetcode.Algorithm;

import java.util.HashMap;
import java.util.Map;

public class a {
    //给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    //你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
    //示例:
    //给定 nums = [2, 7, 11, 15], target = 9
    //因为 nums[0] + nums[1] = 2 + 7 = 9
    //所以返回 [0, 1]
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        System.out.println(result.length);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if ((nums[i] + nums[j]) == target) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }

    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

//    给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//    如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//    您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//    示例：
//    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//    输出：7 -> 0 -> 8
//    原因：342 + 465 = 807

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1n = l1.next;
        ListNode l1nn = l1n.next;

        int v1 = l1.val;
        int v1n = l1n.val;
        int v1nn = l1nn.val;

        ListNode l2n = l2.next;
        ListNode l2nn = l2n.next;

        int v2 = l2.val;
        int v2n = l2n.val;
        int v2nn = l2nn.val;

        int i1=v1nn*100+v1n*10+v1;
        int i2=v2nn*100+v2n*10+v2;

        int i=i1+i2;

        int r1=(int)i/100;
        int r2=(int)(i%100)/10;
        int r3=(int)i%10;

        ListNode rl1 = new ListNode(r3);
        ListNode rl2 = new ListNode(r2);
        ListNode rl3 = new ListNode(r1);
        rl2.next=rl3;
        rl1.next=rl2;
        return rl1;
    }


    public static void main(String[] args) {
        ListNode l2 = new ListNode(2);
        ListNode l4 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l4.next=l3;
        l2.next=l4;

        ListNode m5 = new ListNode(5);
        ListNode m6 = new ListNode(6);
        ListNode m4 = new ListNode(4);
        m6.next=m4;
        m5.next=m6;

        ListNode listNode = addTwoNumbers(l2, m5);

        int[] nums = {2, 7, 11, 15};
        int[] ints = twoSum(nums, 9);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
