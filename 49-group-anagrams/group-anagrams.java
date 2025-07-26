class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                List<String> li = new ArrayList<>();
                li.add(s);
                map.put(key, li);
            }

        }

        return new ArrayList<>(map.values());
    }
}