import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        //Two Sum
        System.out.println("Two Sum:");
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9))+"\n");

        //Roman to Integer
        System.out.println("Roman to Integer:");
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}