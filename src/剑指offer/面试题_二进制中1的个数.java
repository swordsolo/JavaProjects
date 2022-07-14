package 剑指offer;

public class 面试题_二进制中1的个数 {
    public static void main(String[] args) {
        System.out.println("二进制中1的个数" + numberOf1(9));

    }

    public static int numberOf1(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 0) {
                count++;
            }
            n >>= 1;
        }
        return count;

    }
}
