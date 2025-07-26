class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            int[] count = new int[26];
            for (char c: s.toCharArray()) {
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int num: count) {
                sb.append(num).append("#");
            }
            String key = sb.toString();

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