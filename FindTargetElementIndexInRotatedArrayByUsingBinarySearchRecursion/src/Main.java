 class Solution {
    public static int search(int[] arr,int target){
        return find(arr,target,0,arr.length-1);
    }
    public static int find(int[] arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return find(arr, target, start, mid - 1);
            } else {
                return find(arr, target, mid + 1, end);
            }
        }
        if(target>=arr[mid] && target<=arr[end]){
            return find(arr,target,mid+1,end);
        }
        return find(arr,target,start,mid-1);
    }
    public static void main(String[] args) {
       int[] arr={4,5,6,7,0,1,2};
       int ans=search(arr,0);
        System.out.println(ans);
    }
}