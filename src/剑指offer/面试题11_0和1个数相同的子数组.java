package 剑指offer;

import java.util.HashMap;
import java.util.List;

public class 面试题11_0和1个数相同的子数组 {
//    求0和1个数相同最长连续子数组的长度
    public static void main(String[] args) {
        int[] nums={0,1,0,1,0,0,1};
        int count=findMaxLength(nums);
        System.out.println(count);

    }

    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> sumToIndex = new HashMap<>();
        sumToIndex.put(0, -1);
        int sum = 0;
        int maxLenght=0;
        for (int i=0;i<nums.length;i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if(sumToIndex.containsKey(sum)){
                maxLenght=Math.max(maxLenght,i-sumToIndex.get(sum));
            }
            else{
                sumToIndex.put(sum,i);
            }
        }
        return maxLenght;
    }
}
