ublic class PiDigits {
    public static void main(String[] args) {
        int[] piArray = getFirstThreeDigitsOfPi();
        
        for (int digit : piArray) {
            System.out.print(digit + " ");
        }
    }

    static int[] getFirstThreeDigitsOfPi() {
        int[] piDigits = {3, 1, 4};
        return piDigits;
    }
}