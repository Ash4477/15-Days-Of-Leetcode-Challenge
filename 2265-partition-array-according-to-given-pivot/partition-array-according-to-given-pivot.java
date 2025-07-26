class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) less.add(num);
            else if (num == pivot) equal.add(num);
            else greater.add(num);
        }

        int[] res = new int[nums.length];
        int idx = 0;

        for (int num : less) res[idx++] = num;
        for (int num : equal) res[idx++] = num;
        for (int num : greater) res[idx++] = num;

        return res;
    }
}
