class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> li = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            if (nums[i]%2==0) {
                li.add(0,nums[i]);
            } else {
                li.add(nums[i]);
            }
        }

        int[] arr = new int[li.size()];

        for (int i = 0; i < li.size(); i++) {
            arr[i] = li.get(i); // unboxing Integer to int
        }
        return arr;
    }
}