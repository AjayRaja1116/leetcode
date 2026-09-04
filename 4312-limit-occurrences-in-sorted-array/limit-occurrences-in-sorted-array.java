class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] freq = new int[101];
        int[] result = new int[nums.length];

        int index = 0;

        for (int num : nums) {
            freq[num]++;

            if (freq[num] <= k) {
                result[index] = num;
                index++;
            }
        }

        return Arrays.copyOf(result, index);
    }
}