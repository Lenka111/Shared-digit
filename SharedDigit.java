//Elena Voinu
/*Control Flow Statements
 Program that checks if there is a digit that appears in two numbers*/


public class SharedDigit {
    /*The method should return true if there is a digit that appears in both numbers, 
such as 2 in 12 and 23; otherwise, the method should return false.*/

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


    }// end method hasSharedDigit()

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,21));
    }// end main

}// end class
