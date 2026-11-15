class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;

        long odd = 0;
        long even = 1;
        long prefixSum = 0;
        long result = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                result += odd;
                even++;
            } else {
                result += even;
                odd++;
            }

            result %= mod;
        }

        return (int) result;
    }
}
