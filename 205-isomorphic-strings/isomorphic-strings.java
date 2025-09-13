class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] map1 = new char[256];
        char[] map2 = new char[256];

        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();

        for (int i=0; i<sA.length; i++) {
            if (map1[sA[i]] != 0) {
                if (map1[sA[i]] != tA[i]) return false;
            } else {
                map1[sA[i]] =  tA[i];
            }
        }

        for (int i=0; i<sA.length; i++) {
            if (map2[tA[i]] != 0) {
                if (map2[tA[i]] != sA[i]) return false;
            } else {
                map2[tA[i]] =  sA[i];
            }
        }

        return true;
    }
}