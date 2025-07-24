class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();

        int len = s.length();
        for (int i=0; i<len; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<List<Character>> buckets = new ArrayList<>();
        for (int i=0; i<=len; i++) {
            buckets.add(new ArrayList<>());
        }

        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            buckets.get(entry.getValue()).add(entry.getKey());
        }

        StringBuilder res = new StringBuilder();
        for (int freq=len; freq>0; freq--) {
            for (char c: buckets.get(freq)) {
                for (int i=0; i<freq; i++) {
                    res.append(c);
                }
            }
        }
      

        return res.toString();
    }
}