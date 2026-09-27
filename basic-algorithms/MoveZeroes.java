
import java.util.Arrays;

public class MoveZeroes {

    static void moveZeroes(int[] nums) {

        int position = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[position] = num;
                position++;
            }
        }

        while (position < nums.length) {
            nums[position] = 0;
            position++;
        }
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));

        // Test Case 2 - all zeroes
        int[] nums2 = {0, 0, 0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
