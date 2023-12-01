 class Main {
    public static int findIndex(int[] arr, int target){
        return search(arr,target,0);
    }
    public static int search(int[] arr,int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
        return search(arr,target,index+1);

        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,68};
        System.out.println(findIndex(arr,68));
    }
}