class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();

        int len = s.length();
        for (int i=0; i<len; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder res = new StringBuilder();

        while (res.length() != len) {
            char largest = 0;
            int count = 0;
            for (char c: map.keySet()) {
                int charCount = map.get(c);
                if (charCount > count){
                    largest = c;
                    count = charCount;
                }
            }
            for (int i=0; i<count; i++) res.append(largest);
            map.remove(largest);
        }

        return res.toString();
    }
}