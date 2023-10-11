import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int num = 0;
        Map<Character, Integer> romeVal = new HashMap<>();
        romeVal.put('I', 1);
        romeVal.put('V', 5);
        romeVal.put('X', 10);
        romeVal.put('L', 50);
        romeVal.put('C', 100);
        romeVal.put('D', 500);
        romeVal.put('M', 1000);
        for (int i = 0; i < len; i++) {
            if (i < len - 1 && romeVal.get(s.charAt(i)) < romeVal.get(s.charAt(i + 1))) {
                num -= romeVal.get(s.charAt(i));
            } else {
                num += romeVal.get(s.charAt(i));
            }
        }
        return num;
    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            //for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[i+1] == target) {
                    return new int[]{i, i+1};
                }
           // }
        }
        return new int[]{};
    }
}
