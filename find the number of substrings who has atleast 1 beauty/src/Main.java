//count the number of substrings who has at least 1 beauty (beauty means diff of highest frequency- lower frequency)
import java.util.*;
class SumOfBeauty {
    public static int sumOfBeauty(String s) {
        // Write your code here.
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int[] alpha=new int[26];
            for(int j=i;j<n;j++){
                alpha[s.charAt(j)-'a']++;
                ans+=beauty(alpha);
            }
        } return ans;
    }
    private static int beauty(int[] alpha){
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(alpha[i]==0)continue;
            mini=Math.min(mini,alpha[i]);
            maxi=Math.max(maxi,alpha[i]);
        } return maxi-mini;
    }
    public static void main(String[] args){
        String s="hello";
        int ans=sumOfBeauty(s);
        System.out.println(ans);
    }
}