import java.util.*;
class Solution {
    public static List<List<Integer>> combinationSum(int[] a, int t) {
        Arrays.sort(a);
        List<List<Integer>> ans=new ArrayList<>();
        helper(a,t,0,a.length,ans,new ArrayList<Integer>());
        return ans;
    }
    public static void helper(int[] arr,int target,int i,int n,List<List<Integer>> ans,List<Integer> list){
        if(i==n){
            if(target==0){
                ans.add(new ArrayList<>(list));
                return;
            }
            return;
        }
        if(target>=arr[i]){
            list.add(arr[i]);
            helper(arr,target-arr[i],i,n,ans,list);
            list.remove(list.size()-1);

        }
        helper(arr,target,i+1,n,ans,list);

    }
    public static void main(String[] args){
        int[] a={1,2,3};
        List<List<Integer>> ans=combinationSum(a,5);
        for(List<Integer> data:ans){
            System.out.print(data+ ",");
        }
    }
}

