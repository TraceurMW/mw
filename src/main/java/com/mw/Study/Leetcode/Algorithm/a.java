package com.mw.Study.Leetcode.Algorithm;

import java.math.BigInteger;
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


    public static ListNode getLastListNode(ListNode listNode) {
        while (listNode.next != null) {
            listNode = listNode.next;
        }
        return listNode;
    }

    public static ListNode getListNodeFromArray(int[] array) {
        ListNode node = new ListNode(-1);
        for (int i = 0; i < array.length; i++) {
            if (node.val == -1) {
                node.val = array[i];
                continue;
            }

            ListNode digitNode = new ListNode(array[i]);
            ListNode lastListNode = getLastListNode(node);
            lastListNode.next = digitNode;
        }
        return node;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger l1Index = new BigInteger("1");
        BigInteger l1Total = new BigInteger("0");
        do {
            l1Total = l1Total.add(l1Index.multiply(new BigInteger(String.valueOf(l1.val))));
            l1Index = l1Index.multiply(new BigInteger("10"));
            l1 = l1.next;
        } while (l1 != null);

        BigInteger l2Index = new BigInteger("1");
        BigInteger l2Total = new BigInteger("0");
        do {
            l2Total = l2Total.add(l2Index.multiply(new BigInteger(String.valueOf(l2.val))));
            l2Index = l2Index.multiply(new BigInteger("10"));
            l2 = l2.next;
        } while (l2 != null);
        ListNode result = new ListNode(-1);
        BigInteger total = l1Total.add(l2Total);
        do {
            BigInteger digit = total.mod(new BigInteger("10"));
            total = total.divide(new BigInteger("10"));
            System.out.println(total);
            if (result.val == -1) {
                result.val = digit.intValue();
                continue;
            }
            ListNode digitNode = new ListNode(digit.intValue());
            ListNode lastListNode = getLastListNode(result);
            lastListNode.next = digitNode;
        } while ((!total.equals(new BigInteger("0")) && (total.compareTo(new BigInteger("10")) == -1)) || !total.divide((new BigInteger("10"))).equals(new BigInteger("0")));
        return result;
    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    //    给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//    示例 1:
//    输入: 123
//    输出: 321
//    示例 2:
//    输入: -123
//    输出: -321
//    示例 3:
//    输入: 120
//    输出: 21
    public static int reverse(int x) {
        boolean isLost=false;
        if (x<0){
            isLost=true;
            x=-x;
        }
        if (x>10){
            while(x%10==0){
                x/=10;
            }
        }
        System.out.println(x);
        Integer integer = new Integer(x);
        String s = integer.toString();
        char[] chars = s.toCharArray();
        char[] charsReverse=new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charsReverse[chars.length-1-i]=chars[i];
        }
        String s1="";
        for (char c : charsReverse) {
            s1+=c;
        }
        long i = Long.parseLong(s1);
        if (isLost){
            i=-i;
        }
        return (int)i;
    }

    public static int reverse1(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }




    public static void main(String[] args) {
        int i = -2147483648;
        reverse1(i);
        i=-i;
        System.out.println(i);
//        reverse(-2147483648);
//        int[] v1 = {2,4,3};
//        int[] v2 = {5,6,4};
//        ListNode l1 = getListNodeFromArray(v1);
//        ListNode l2 = getListNodeFromArray(v2);
//        ListNode listNode = addTwoNumbers1(l1, l2);
//        int a = 0;
//        ListNode l2 = new ListNode(2);
//        ListNode l4 = new ListNode(4);
//        ListNode l3 = new ListNode(3);
//        l4.next = l3;
//        l2.next = l4;
//
//        ListNode m5 = new ListNode(5);
//        ListNode m6 = new ListNode(6);
//        ListNode m4 = new ListNode(4);
//        m6.next = m4;
//        m5.next = m6;
//
//        ListNode listNode = addTwoNumbers(l2, m5);
//        int aadasd = 0;
//        int[] nums = {2, 7, 11, 15};
//        int[] ints = twoSum(nums, 9);
//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }
    }
}
