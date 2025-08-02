class Solution {
    public int findTheWinner(int n, int k) {
       return fn(n,k)+1;
    }

    private int fn(int n, int k) {
        if (n == 1) return 0;

        return (fn(n-1, k)+k)%n;
    }
}