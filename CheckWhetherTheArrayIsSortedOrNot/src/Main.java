 class Solution {
    public static boolean sortedOrNot(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sortedOrNot(arr,index+1);
    }
    public static void main(String[] args) {
      int[] arr={1,2,4,6};
        System.out.println(sortedOrNot(arr,0));
    }
}