class Solution {
    public int largestAltitude(int[] gain) {
        int currAlt = 0;
        int highestAlt = 0;

        for (int n: gain) {
            currAlt += n;
            highestAlt = Math.max(highestAlt, currAlt);
        }

        return highestAlt;
    }
}