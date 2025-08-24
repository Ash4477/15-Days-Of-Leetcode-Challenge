class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        int n = strs.length;

        for (int i=0; i<n; i++) {
            char[] curr = strs[i].toCharArray();
            Arrays.sort(curr);
            String currStr = new String(curr);
            if (mp.containsKey(currStr)) {
                mp.get(currStr).add(strs[i]);
            } else {
                List<String> li = new ArrayList<>();
                li.add(strs[i]);
                mp.put(currStr, li);
            }
        }

        return new ArrayList<>(mp.values());
    }
}