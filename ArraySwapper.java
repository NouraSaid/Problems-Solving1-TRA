import java.util.Arrays;

public class Main {
    public static class ArraySwapper {
        public static int[] swapFirstAndLast(int[] nums) {

            if (nums.length >= 1) {

                int temp = nums[0];
                nums[0] = nums[nums.length - 1];
                nums[nums.length - 1] = temp;
            }

            return nums;
        }

        public static void main(String[] args) {

            int[] array = {1, 2, 3, 4, 5};
            int[] result = swapFirstAndLast(array);


            System.out.println(Arrays.toString(result));
        }
    }
}