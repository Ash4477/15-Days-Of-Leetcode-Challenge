class Solution {
    public int largestAltitude(int[] gain) {
        int highestAlt = 0;
        int totalGain = 0;
        for (int i=0 ; i<gain.length; i++) {
            int newGain = totalGain + gain[i];
            if (newGain > totalGain && newGain > highestAlt) {
                highestAlt = newGain;
            }
            totalGain = newGain;
        }
        return highestAlt;
    }
}