class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(key);
        }

        int[] result = new int[k];
        int resIdx = 0;

        for (int i = buckets.length - 1; i >= 0 && resIdx < k; i--) {
            if (buckets[i] != null) {
                for (int j = 0; j < buckets[i].size() && resIdx < k; j++) {
                    result[resIdx++] = buckets[i].get(j);
                }
            }
        }
        return result;
    }
}