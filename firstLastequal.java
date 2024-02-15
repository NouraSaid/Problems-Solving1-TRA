public class FirstLastEqual {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3}; // False
        int[] array2 = {1, 2, 3, 1}; // true
        int[] array3 = {1, 2, 1}; // true


        System.out.println(firstLastEqual(array1));  
        System.out.println(firstLastEqual(array2));  
        System.out.println(firstLastEqual(array3));  
     
    }

    public static boolean firstLastEqual(int[] nums) {
        // Check if the array has a length of 1 or more
        if (nums.length >= 1) {
            
            // Check if the first and last elements are equal
            return nums[0] == nums[nums.length - 1];
        } else {
            
            // If the array is empty, return false
            return false;
        }
    }
}