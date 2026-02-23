class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int lastIdx = flowerbed.length-1;
        int canPlant = 0;

        if (lastIdx == 0) {
            if (flowerbed[lastIdx] == 0) return (1 >= n);
            else return (0 == n);
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            canPlant++;
        }

        if (flowerbed[lastIdx] == 0 && flowerbed[lastIdx-1] == 0) {
            flowerbed[lastIdx] = 1;
            canPlant++;
        }

        for (int i=1; i<lastIdx; i++) {
            if (flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                canPlant++;
                flowerbed[i] = 1;
            }
        }

        return canPlant >= n;
    }
}