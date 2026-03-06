import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(0, candidates, target, list, new ArrayList<>());
        return list;
    }

    void backtrack(int start, int[] arr, int target, List<List<Integer>> list, List<Integer> curr) {
        if (target == 0) {
            list.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (arr[i] > target) break;
            if (i > start && arr[i] == arr[i-1]) continue;

            curr.add(arr[i]);
            backtrack(i + 1, arr, target - arr[i], list, curr);
            curr.remove(curr.size() - 1);
        }
    }
}