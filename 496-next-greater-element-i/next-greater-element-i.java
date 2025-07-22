class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num: nums1) {
            mp.put(num, -1);
        }


        for (int i=0; i<nums2.length; i++) {
            if (mp.containsKey(nums2[i])) {
                int j = i+1;
                while (j < nums2.length && nums2[i] > nums2[j]) {
                    j++;
                }
                if (j != nums2.length) mp.put(nums2[i], nums2[j]);
            }
        }

        int[] answer = new int[nums1.length];
        for (int i=0; i<nums1.length; i++) {
            answer[i] = mp.get(nums1[i]);
        }

        return answer;
    }
}