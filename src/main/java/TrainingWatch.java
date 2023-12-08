public class TrainingWatch extends TrainingEvaluation{
    private int trainingLength = 45;
    private int caloriesBurned = 250;
    private int averagePulse = 160;

    public int getTrainingLength() {
        return trainingLength;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public int getAveragePulse() {
        return averagePulse;
    }

    public void setTrainingLength(int trainingLength) {
        this.trainingLength = trainingLength;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public void setAveragePulse(int averagePulse) {
        this.averagePulse = averagePulse;
    }
}
