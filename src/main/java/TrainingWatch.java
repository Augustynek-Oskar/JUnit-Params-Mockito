public class TrainingWatch implements TrainingParameters {
    private int trainingLength;
    private int caloriesBurned;
    private int averagePulse;


    @Override
    public int showTrainingLength(int lengthInMinutes) {
        return 0;
    }

    @Override
    public int showCaloriesBurned(int kcal) {
        return 0;
    }

    @Override
    public int showAvgPulse(int pulse) {
        return 0;
    }
}
