class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i=0; i<n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        n = n/3;
        List<Integer> res = new ArrayList<>();

        for (int i: map.keySet()) {
            int count = map.get(i);
            if (count > n) res.add(i);
        }

        return res;
    }
}