class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> baseMap = new HashMap<>();
        for (char c : chars.toCharArray()) {
            baseMap.put(c, baseMap.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        for (String word : words) {
            HashMap<Character, Integer> tempMap = new HashMap<>(baseMap);
            boolean valid = true;

            for (char c : word.toCharArray()) {
                if (!tempMap.containsKey(c) || tempMap.get(c) == 0) {
                    valid = false;
                    break;
                }
                tempMap.put(c, tempMap.get(c) - 1);
            }

            if (valid) {
                res += word.length();
            }
        }

        return res;
    }
}
