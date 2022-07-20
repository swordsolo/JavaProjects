package 剑指offer;

import java.util.Arrays;

public class 面试题14_字符串中的变位词 {
    public static void main(String[] args) {
        String s1="ac";
        String s2="dgcaf";
        boolean res=checkInCLUSION(s1,s2);
        System.out.println(res);
    }
    public static boolean checkInCLUSION(String s1,String s2){
        if(s2.length()<s1.length()){
            return false;
        }
        int[] counts=new int[26];
        System.out.println(Arrays.toString(counts));
        for(int i=0;i<s1.length();i++){
            counts[s1.charAt(i)-'a']++;
            counts[s2.charAt(i)-'a']--;
            System.out.println(Arrays.toString(counts));
        }
        for(int i=0;i<s2.length()-s1.length();i++){
            counts[s2.charAt(i+s1.length())-'a']--;
            counts[s2.charAt(i)-'a']++;
            System.out.println(Arrays.toString(counts));
            if(areAllZero(counts)){
                return true;
            }
        }
        return false;

        }

    public static boolean areAllZero(int[] counts){
        for(int count:counts){
            if(count!=0){
                return false;
            }
        }
        return true;
    }


}
