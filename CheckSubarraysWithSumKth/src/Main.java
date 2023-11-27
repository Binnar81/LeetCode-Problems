import java.util.*;
 class Solution {
    public static boolean isSubsetPresent(int n, int k,int []a) {
        // Write your code here
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum == k) {
                    // If the sum is equal to k, add the subarray to the result
                    ArrayList<Integer> subarray = new ArrayList<>();
                    for (int l = i; l <= j; l++) {
                        subarray.add(a[l]);
                    }
                    ans.add(subarray);
                }
            }
        }

        if(ans.isEmpty()){
            return false;

        }
        return true;

    }
    public static void main(String[] args){
        int[] a={1,2,3,1,1,1};
        int n=a.length;
        boolean ans=isSubsetPresent(n,3,a);
        System.out.println(ans);
    }
}