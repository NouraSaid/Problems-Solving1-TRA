public class NoTwoOrThree {

    public static void main(String[] args) {
        int[] array1 = {1, 4};
        int[] array2 = {2, 3};

       
        System.out.println(noTwoOrThree(array1)); 
        System.out.println(noTwoOrThree(array2)); 
    }

    static boolean noTwoOrThree(int[] nums) {
    
    
        return nums.length == 2  && nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
        //check the length if it is  2
        // First & last not equal to 2 or 3
         // First & last not equal to 2 or 3
    }
}