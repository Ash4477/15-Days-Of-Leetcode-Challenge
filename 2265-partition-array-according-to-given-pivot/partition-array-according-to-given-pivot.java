class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        Map<Integer,List<Integer>> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == pivot) insert(0, nums[i], map);
            else if (nums[i] > pivot) insert(1, nums[i], map);
            else insert(-1, nums[i], map);
        }

        int[] result = new int[nums.length];
        int resIdx = 0;

        List<Integer> li;
        
        if (map.containsKey(-1)) {
            li = map.get(-1);
            for (int i=0; i<li.size(); i++) {
                result[resIdx++] = li.get(i);
            }
        } 

        if (map.containsKey(0)) {

            li = map.get(0);

            for (int i=0; i<li.size(); i++) {
                result[resIdx++] = li.get(i);
            }
        }

        if (map.containsKey(1)) {
            
            li = map.get(1);
            for (int i=0; i<li.size(); i++) {
                result[resIdx++] = li.get(i);
            }
        }



        return result;
    }

    public void insert(int key, int value, Map<Integer,List<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            map.put(key, new ArrayList<>());
            map.get(key).add(value);
        }
    };
}