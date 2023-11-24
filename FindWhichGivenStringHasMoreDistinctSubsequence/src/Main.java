class Solution{
    public static String MoreSubsequence(int m, int n,String a, String b){
        int countA=countSubsequence(a);
        int countB=countSubsequence(b);
        if(countA>=countB){
            return a;
        }
        return b;
    }
    public static int countSubsequence(String s){
        int n=s.length();
        int[] dp=new int[n+1];
        int[] last=new int[26];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]=2*dp[i-1];
            char ch=s.charAt(i-1);
            if(last[ch-'a']>0){
                dp[i]-=dp[last[ch-'a']-1];
            }
            last[ch-'a']=i;
        }
        return dp[n];
    }
    public static void main(String[] args){
        String a="egg";
        String b="a";
        int m=a.length();
        int n=b.length();
        String ans=MoreSubsequence(m,n,a,b);
        System.out.println(ans);
    }
}