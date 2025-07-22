class Solution {
    public boolean rotateString(String s, String goal) {
        for (int i=s.length(); i>0; i--) {
            StringBuilder sb = new StringBuilder(s.substring(i));
            sb.append(s.substring(0, i));
            if (sb.toString().equals(goal)) return true;
        }
        return false;
    }

  
}