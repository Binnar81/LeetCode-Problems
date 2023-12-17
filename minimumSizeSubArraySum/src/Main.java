class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
        int max=Integer.MAX_VALUE, windowStart=0, windowSum=0;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            windowSum+=nums[windowEnd];

            while(windowSum>=target){
                max=Math.min(max, windowEnd-windowStart+1);
                windowSum-=nums[windowStart];

                windowStart++;
            }
        }
        if(max==Integer.MAX_VALUE){
            return 0;

        } return max;
    }
    public static void main(String[] args){
        int[] nums={1,4,5,2,1,4};
        int ans=minSubArrayLen(7,nums);
        System.out.println(ans);
    }

}