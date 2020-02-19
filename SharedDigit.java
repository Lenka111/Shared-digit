public class SharedDigit {
    // write your code here

    public static boolean hasSharedDigit(int num1, int num2){
        //get the first digit in a number
        int firstDigitNum1 = num1/10;
        int firstDigitNum2 = num2/10;
        //get the last digit in a number
        int lastDigitNum1 = num1 % 10;
        int lastDigitNum2 = num2 % 10;

        //if number is not in the range of 10 (inclusive) - 99 (inclusive)
        if((num1 < 10 || num1 > 99)||(num2 < 10 || num2 > 99)){
            return false;
        }

        return (firstDigitNum1 == firstDigitNum2) || (lastDigitNum1 == lastDigitNum2) || (firstDigitNum2 == lastDigitNum1);


    }// end method

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,21));
    }

}// end class