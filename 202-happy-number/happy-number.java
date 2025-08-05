class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int result = n;

        while (result != 1) {
            int num = result;
            result = 0;
            if (set.contains(num)) return false;
            set.add(num);
            while (num>0) {
                int digit = num % 10;
                result += (digit*digit);
                num /= 10;
            }
        }

        return true;
    }
}