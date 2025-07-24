class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];
        
        for (int k=0; k<heights.length; k++) {
            int largest = -1;
            int largestIdx = -1;
            System.out.println("HUYE");
            for (int i=0; i<heights.length; i++) {
                if (heights[i] != -1 && heights[i] > largest) {
                    largest = heights[i];
                    largestIdx = i;
                }
            }
            heights[largestIdx] = -1;
            result[k] = names[largestIdx];
        }

        return result;
    }
}