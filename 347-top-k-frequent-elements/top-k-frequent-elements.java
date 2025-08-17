class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] result = new int[k];
        for (int i=0; i<k; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
                if (maxVal == Integer.MIN_VALUE || entry.getValue() > map.get(maxVal)) {
                    maxVal = entry.getKey();
                }
            }
            result[i] = maxVal;
            map.remove(maxVal);
        }

        return result;
    }
}