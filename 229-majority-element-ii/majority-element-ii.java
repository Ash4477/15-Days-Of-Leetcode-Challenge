class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int majority1 = 0;
        int majority2 = 0;
        int count1 = 0;
        int count2 = 0;

        int n = nums.length;
        for (int i=0; i<n; i++) {
            if (nums[i] == majority1) count1++;
            else if (nums[i] == majority2) count2++;
            else if (count1 == 0) {
                majority1 = nums[i];
                count1++;
            }
            else if (count2 == 0) {
                majority2 = nums[i];
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i=0; i<n; i++) {
            if (nums[i] == majority1) count1++;
            else if (nums[i] == majority2) count2++;
        }

        n = n/3;
        List<Integer> res = new ArrayList<>();

        if (count1 > n) {
            res.add(majority1);
        }

        if (count2 > n) {
            res.add(majority2);
        }

        return res;
    }
}