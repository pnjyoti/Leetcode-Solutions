public class BinarySearch {

    static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums1, 9));

        // Test Case 2 - target not present
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums2, 2));
    }
}