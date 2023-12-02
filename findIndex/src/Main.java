class Solution{
    public static int findIndex(int[] arr, int target, int index){
        if(arr.length==index){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr,target,index+1);
        }

    }
    public static void main(String[] args){
        int[] arr={1,3,5,8,6,8};
        int ans=findIndex(arr,5,0);
        System.out.println(ans);
    }
}