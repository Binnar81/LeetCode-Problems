import java.util.ArrayList;
import java.util.*;
class Solution
{
    public static ArrayList<Integer> minSubarray(ArrayList<Integer> arr, int n, int x)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int windowStart = 0, windowSum = 0;
        int minLength = Integer.MAX_VALUE;
        int currentLength;

        for (int windowEnd = 0; windowEnd < n; windowEnd++) {
            windowSum += arr.get(windowEnd);

            while (windowSum > x) {
                currentLength = windowEnd - windowStart + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    ans = new ArrayList<>(arr.subList(windowStart, windowEnd + 1));
                }

                windowSum -= arr.get(windowStart);
                windowStart++;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,3,4,5,6,2));
        ArrayList<Integer> ans=minSubarray(nums,nums.size(),7);
        for(int data:ans){
            System.out.print(data+ ",");
        }
    }
}
