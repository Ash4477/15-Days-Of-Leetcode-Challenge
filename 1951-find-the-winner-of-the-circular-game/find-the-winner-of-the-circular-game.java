class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            circle.add(i);
        }
        int currIdx = 0;

        while (circle.size() > 1) {
            int nextRemoval = (currIdx + k - 1) % circle.size();
            circle.remove(nextRemoval);
            currIdx = nextRemoval;
        }

        return circle.get(0);
    }
}