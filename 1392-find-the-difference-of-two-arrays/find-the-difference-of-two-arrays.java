import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();


        for (int num: nums1) {
            set1.add(num);
        }

        for (int num: nums2) {
            set2.add(num);
        }
        List<Integer> li1 = new ArrayList<>(set1);
        List<Integer> li2 = new ArrayList<>(set2);
        li1.removeAll(set2);
        li2.removeAll(set1);

        ans.add(li1);
        ans.add(li2);
        return ans;
    }
}
  