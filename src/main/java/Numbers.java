public class Numbers {
    public boolean checkIfNumbersIsDivisibleByTwo(int number){
        if (number == 0){
            return false;
        }
        else if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int getSumOfDigitsInNumber(int number) {
        int sumOfDigits = 0;
        while (number > 0){
            sumOfDigits = sumOfDigits + number % 10;
            number = number / 10;
        }
        return sumOfDigits;
    }
}
