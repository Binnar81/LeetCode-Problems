 class Solution {
     public static int[] findAverage(int[] arr, int k) {
         int n = arr.length;
         int[] ans = new int[n-k+1];
         int windowSum = 0;
         for (int windowStart = 0; windowStart < n; windowStart++) {
             windowSum += arr[windowStart];
             if (windowStart >= k - 1) {
                 ans[windowStart-k+1] = windowSum / k;
                 windowSum -= arr[windowStart-k+1];
                 windowStart++;
             }
         }
         return ans;
     }

     public static void main(String[] args) {
         int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
         int k = 5;
         int[] ans = findAverage(arr, k);
         for (int i = 0; i < k; i++) {
             System.out.print(ans[i] + ",");
         }
     }
 }