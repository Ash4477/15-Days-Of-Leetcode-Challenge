class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for (int i=0;i<arr.length;i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        for (int i: mp.keySet()) {
            set.add(mp.get(i));
        }

        return set.size() == mp.size();
    }
}