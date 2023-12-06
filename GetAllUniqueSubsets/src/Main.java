import java.util.*;
 class Solution{
    public static ArrayList<ArrayList<Integer>> getUniqueSubsets(ArrayList<Integer> arr){
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        helper(ans,0,new ArrayList<Integer>(),arr);
        return ans;
    }
    public static void helper(ArrayList<ArrayList<Integer>> ans,int i,ArrayList<Integer> list,ArrayList<Integer> arr){
        if(i<=arr.size()){
            ans.add(new ArrayList<>(list));
        }
        while(i<arr.size()){
            list.add(arr.get(i));
            helper(ans,i+1,list,arr);
            list.remove(list.size()-1);
            i++;
            while(i<arr.size() && arr.get(i)==arr.get(i-1)){
                i++;
            }

        } return;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,3,5,2,4,0));
        ArrayList<ArrayList<Integer>> ans=getUniqueSubsets(arr);
        for(ArrayList<Integer> data:ans){
            System.out.print("[");
            for(int info:data){
                System.out.print(info+ ",");
            }
            System.out.print("]");
        }
    }
}