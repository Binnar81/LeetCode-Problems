import java.util.*;
class Solution {
    public  List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        generateSubsets(nums,0,new ArrayList<>(),ans);
        return ans;

    }
    public static void generateSubsets(int[] nums,int i, List<Integer> currentsubset,List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<>(currentsubset));
            return;
        }
        generateSubsets(nums,i+1,currentsubset,result);
        currentsubset.add(nums[i]);
        generateSubsets(nums,i+1,currentsubset,result);
        currentsubset.remove(currentsubset.size()-1);
    }

}