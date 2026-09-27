import java.util.Arrays;

public class ReverseString {

    static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        // Test Case 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println(Arrays.toString(s1));

        // Test Case 2 - single character
        char[] s2 = {'a'};
        reverseString(s2);
        System.out.println(Arrays.toString(s2));
    }
}