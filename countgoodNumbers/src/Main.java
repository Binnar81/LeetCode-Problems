 class Solution {

    public static int countGoodNumbers(long n){
        long MOD=1_000_000_007;
        long even=(n+1)/2;
        long odd=n/2;
        return (int) (pow(5,even)*pow(4,odd)%MOD);
    }
    public  static long pow(long x, long n){
         long MOD=1_000_000_007;
        if(n==0)
            return 1;
        long temp=pow(x,n/2);
        if(n%2==0){
            return (temp*temp)%MOD;
        }
        else
            return (temp*temp*x)%MOD;

    }

    public static void main(String[] args) {
        int ans=countGoodNumbers(1);
        System.out.println(ans);
    }
}