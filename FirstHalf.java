public class FirstHalfOfString {
    public static void main(String[] args) {
        String inputString = "WooHoo";
        String firstHalf = getFirstHalf(inputString);
        System.out.println(firstHalf);
    }

    static String getFirstHalf(String str) {
        int length = str.length();
        
        int endIndex = length / 2; // get the index 
        
        
        String firstHalf = str.substring(0, endIndex); // get the first half
        return firstHalf;
    }
}