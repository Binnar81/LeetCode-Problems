 class Solution {
    public static int countSteps(int n){
        return helper(n, 0);
    }
    private static int  helper(int n, int count){
        if(n==1){
            return count;
        }
        if(n%3==0){
            return helper(n/3,count+1);
        }
        else if(n%2==0){
            return helper(n/2, count+1);
        }
        else{
            return helper(n-1,count+1);
        }
    }
    public static void main(String[] args) {
        int ans=countSteps(10);
        System.out.println(ans);
    }
}