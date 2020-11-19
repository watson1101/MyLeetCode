package com.hong.algorithms.easy;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。(即原来元素顺序不变，不需要排序)
 * <p>
 * 示例: 输入: [0,1,0,3,12] 输出: [1,3,12,0,0]
 * <p>
 * 说明: 必须在原数组上操作，不能拷贝额外的数组。 尽量减少操作次数。
 * <p>
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/move-zeroes 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class moveZeroesEnd {

    public static void main(String[] args) {
//        int[] nums = {0, 1, 0, 3, 12, 8};
        int[] nums = {1, 0, 0};
        new moveZeroesEnd().moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        int flag = nums.length;
        if (flag < 2) {
            return;
        }
        for (int i = 0; i < flag - 1; i++) {
            while (nums[i] == 0) {
                moveToEnd(nums, i, flag);
                flag--;
                if (flag == i) {
                    return;
                }
            }
        }
        for (int e : nums) {
            System.out.print(e + " ");
        }
        // 不需要排序
//        for (int i = 0; i < flag - 1; i++) {
//            if (nums[i] > nums[i + 1]) {
//                swap(nums, i, i + 1);
//            }
//        }
//        System.out.println("");
//        for (int e : nums) {
//            System.out.print(e + " ");
//        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void moveToEnd(int[] nums, int i, int flag) {
        int temp = nums[i];
        for (int j = i; j < flag - 1; j++) {
            nums[j] = nums[j + 1];
        }
        nums[flag - 1] = temp;
    }
}
