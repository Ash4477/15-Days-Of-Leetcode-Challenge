class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            map.put(heights[i], i);
        }

        Arrays.sort(heights);
        for (int i=0; i<n/2; i++) {
            int temp = heights[i];
            heights[i] = heights[n-1-i];
            heights[n-1-i] = temp;
        }

        String[] result = new String[n];

        for (int i=0; i<n; i++) {
            result[i] = names[map.get(heights[i])];
        }

        return result;
    }
}