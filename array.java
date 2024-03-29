import java.util.Arrays;
//Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
public class Main {    public static int[] mergeArrays(int[] a, int[] b) {

    if (a.length == 0 || b.length == 0) {

        if (a.length != 0)
        {
            return new int[]{a[0]};
        }
        else if (b.length != 0)
        {
            return new int[]{b[0]};
        }
        else
        {
            return new int[0];
        }
    }
    else {

        return new int[]{a[0], b[0]};
    }
}
public static void main(String[] args) {

        int[] arrayA = {6, 7, 8};
        int[] arrayB = {5, 4, 3};
        int[] result = mergeArrays(arrayA, arrayB);


        System.out.println(Arrays.toString(result));
    }}
