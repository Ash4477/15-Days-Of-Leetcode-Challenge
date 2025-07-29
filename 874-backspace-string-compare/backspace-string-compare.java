class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1, j = t.length()-1;
        
        while (i >=0 || j >= 0)  {
            i = getNextValidChar(s, i);
            j = getNextValidChar(t, j);

            if (i<0 && j<0) return true;

            if (i<0 || j<0) return false;

            if (s.charAt(i) != t.charAt(j)) return false;

            i--; j--;
        }

        return true;
    }

    public int getNextValidChar(String str, int end) {
        int count = 0;
        while (end>=0) {
            if (str.charAt(end) == '#') count++;
            else if (count > 0) count--;
            else break;
            end--;
        }
        return end;
    }
}