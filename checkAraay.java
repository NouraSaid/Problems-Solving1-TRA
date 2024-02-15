public class CommonEnd
{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 3};
        
        System.out.println(commonEnd(array1, array2));  // Output: true
    }

    public static boolean commonEnd(int[] num1, int[] num2) {
        // Check if they have the same first element or the same last element
        return (num1[0] == num2[0]) || (num1[num1.length - 1] == num2[num2.length - 1]);
    } 
}