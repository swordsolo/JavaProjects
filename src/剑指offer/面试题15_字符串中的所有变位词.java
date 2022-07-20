package 剑指offer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 面试题15_字符串中的所有变位词 {
    public static void main(String[] args) {
        String s1 = "cbadabacgbca";
        String s2 = "abc";
        List l=findAnagrams(s1,s2);
//        String res=Arrays.toString(l);
        System.out.println(l);
    }
    public static List<Integer> findAnagrams(String s1, String s2){
        List<Integer> indices=new LinkedList<>();
        if(s1.length()<s2.length()){
            return indices;
        }
        int[] counts=new int[26];
        for(int i=0;i<s2.length();i++){
            counts[s2.charAt(i)-'a']++;
            counts[s1.charAt(i)-'a']--;
        }
        if(areAllZero(counts)){
            indices.add(0);
        }
//        for(int i=s2.length();i<s1.length();i++){
//            counts[s1.charAt(i)-'a']++;
//            counts[s1.charAt(i-s2.length())-'a']--;
//            if(areAllZero(counts)){
//                indices.add(i-s2.length()+1);
//            }
//        }
        for(int i=0;i<s1.length()-s2.length();i++){
            counts[s1.charAt(i+s2.length())-'a']--;
            counts[s1.charAt(i)-'a']++;
            if(areAllZero(counts)){
                indices.add(i+1);
            }
        }
        return indices;
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
