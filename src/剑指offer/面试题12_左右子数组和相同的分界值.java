package 剑指offer;

public class 面试题12_左右子数组和相同的分界值 {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,2,9};
        int index=pivotIndex(nums);
        System.out.println(index);

    }
    public static int pivotIndex(int[] nums){
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum-nums[i]==total-sum){
                return i;
            }
        }
        return -1;
    }

}
