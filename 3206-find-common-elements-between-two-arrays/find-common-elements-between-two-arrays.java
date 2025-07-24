class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        int[] result = new int[2];

        for (int i=0;i<nums1.length;i++) {
            mp1.put(nums1[i], mp1.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i=0;i<nums2.length;i++) {
            mp2.put(nums2[i], mp2.getOrDefault(nums2[i], 0) + 1);
        }

        for (int num: mp1.keySet()) {
            if(mp2.containsKey(num)) result[0] += mp1.get(num);
        }

        for (int num: mp2.keySet()) {
            if(mp1.containsKey(num)) result[1] += mp2.get(num);
        }

 

        return result;
    }
}