class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        int open = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == '(') open++;
            else if (arr[i] == ')') {
                if (open == 0) arr[i] = '*';
                else open--;
            }
        }

        if (open != 0)
            for (int i=arr.length-1; i>=0; i--) {
                if (arr[i] == '(' && open > 0) {
                    arr[i] = '*';
                    open--;
                }
            }

        int p=0;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] != '*') arr[p++] = arr[i];
        }

        return new String(arr).substring(0,p);
    }
}