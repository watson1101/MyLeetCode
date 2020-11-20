package com.hong.algorithms.easy;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseInt {

    public static void main(String[] args) {
        int num = -125;
        int r = new ReverseInt().reverse(num);
        System.out.println(num + " ---> " + r);
    }

    /**
     * 抄的别人的过程，方法巧妙，留存！
     * @param x
     * @return
     */
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            // 保存计算之前的结果
            int tmp = result;
            result = (result * 10) + (x % 10);
            x /= 10;
            // 将计算之后的结果 / 10，判断是否与计算之前相同，如果不同，证明发生溢出，返回0
            if (result / 10 != tmp) {
                return 0;
            }
        }

        return result;
    }


}
