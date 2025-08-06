class Solution {
    public boolean hasAllCodes(String s, int k) {
        int comb = 1 << k, hash = 0;
        BitSet seen = new BitSet(comb);

        for (int i = 0; i < s.length(); i++) {
            hash = (hash << 1 | (s.charAt(i) - '0')) & (comb-1);
            if (i >= k - 1) {
                seen.set(hash);
            }
        }

        return seen.cardinality() == comb;

    }
}