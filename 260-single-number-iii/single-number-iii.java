import java.util.*;
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[2];
        int index = 0;
        for (int num : nums) {
            if (map.get(num) == 1) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}