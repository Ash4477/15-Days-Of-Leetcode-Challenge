class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] arr = s.toCharArray();

        while (left < right) {
            while (left < right && !isVowel(arr[left])) left++;
            while (left < right && !isVowel(arr[right])) right--;
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++; right--;
        }

        return new String(arr);
    }

    public boolean isVowel(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') return true;
        else return false;
    }
}