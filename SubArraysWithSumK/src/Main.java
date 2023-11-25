import java.util.*;
 class Solution{
    public static List<List<Integer>> subarraysWithSumK(int[] a, long k) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            long sum=0;
            ArrayList<Integer> subarray=new ArrayList<>();
            for(int j=i;j<n;j++){
                sum+=a[j];
                subarray.add(a[j]);
                if(sum==k){
                    ans.add(subarray);
                    break;
                }
            }
        }
        return ans;
    }

public static void main(String[] args){
    int[] a={1,3,4,1,1,1};
    List<List<Integer>> ans=subarraysWithSumK(a,3);
    for(List<Integer> count:ans){
        System.out.print(count+ ",");
    }

    }
 }