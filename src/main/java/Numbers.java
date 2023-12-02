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
}
