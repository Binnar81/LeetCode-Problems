 import java.util.*;
class Solution {
    public static ArrayList<Integer> subSetSum(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        findSubset(0,arr,0,ans);
        Collections.sort(ans);
        return ans;
    }
    public static void findSubset(int start,int[] arr,int sum, ArrayList<Integer> ans){
        if(start==arr.length){
            ans.add(sum);
            return;
        }
        findSubset(start+1,arr,sum+arr[start],ans);
        findSubset(start+1,arr,sum,ans);

    }
    public static void main(String[] args) {
        int[] arr={1,2,4,3};
        ArrayList<Integer> ans=subSetSum(arr);
        System.out.print("[");
        for(int data:ans){
            System.out.print(data+ ",");
        }
        System.out.println("]");
    }
}