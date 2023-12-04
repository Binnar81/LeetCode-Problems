 import java.util.*;
class Main {
    public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> arr, int target) {
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(arr, 0, arr.size(), target, ans, new ArrayList<Integer>());
        return ans;
    }

    public static void helper(ArrayList<Integer> arr, int start, int n, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < n; i++) {
            if (i > start && arr.get(i).equals(arr.get(i - 1))) {
                continue;
            }
            if (target >= arr.get(i)) {
                list.add(arr.get(i));
                helper(arr, start + 1, n, target - arr.get(i), ans, list);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 6, 2));
        ArrayList<ArrayList<Integer>> ans = combinationSum(arr, 5);
        for (ArrayList<Integer> data : ans) {
            System.out.print("[");
            for (int info : data) {
                System.out.print(info + ",");
            }
            System.out.print("]");

        }
    }
}
