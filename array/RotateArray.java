import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int k;
        Scanner in = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Enter k value");
        k = in.nextInt();
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            rotateByOne(nums, nums.length);
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateByOne(int[] nums, int n) {
        int temp = nums[n - 1];
        for (int i = n - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }
}
