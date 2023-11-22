import java.util.*;
class Solution{
    public static List<List<Integer>> subSets(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        generateSubSets(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void generateSubSets(int[] nums,int i,List<Integer> current,List<List<Integer>> ans){
        int n=nums.length;
        if(i==n){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        generateSubSets(nums,i+1,current,ans);
        current.remove(current.size()-1);
        generateSubSets(nums,i+1,current,ans);

    }
    public static void main(String[] args){
        int[]  nums={1,2,3};
        List<List<Integer>> ans=subSets(nums);
        for(List<Integer> result:ans){
            System.out.print(result+ ",");
            }
        }
    }
