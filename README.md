public int[] findPositive(int[] nums) {
    for (int num : nums) {
        if (num > 0) {
            return new int[]{num};
        }
    }
    return new int[]{};   // No positive number found
}
