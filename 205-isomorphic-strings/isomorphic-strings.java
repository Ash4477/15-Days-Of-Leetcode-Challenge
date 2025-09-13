class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();

        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();

        for (int i=0; i<sA.length; i++) {
            if (map1.containsKey(sA[i])) {
                if (map1.get(sA[i]) != tA[i]) return false;
            } else {
                map1.put(sA[i], tA[i]);
            }
        }

        for (int i=0; i<sA.length; i++) {
            if (map2.containsKey(tA[i])) {
                if (map2.get(tA[i]) != sA[i]) return false;
            } else {
                map2.put(tA[i], sA[i]);
            }
        }

        return true;
    }
}