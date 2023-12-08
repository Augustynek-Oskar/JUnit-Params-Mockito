public class TrainingEvaluation{
    public static void main(String[] args) {
        TrainingWatch trainingWatch = new TrainingWatch();
        float overallRating = (float) (lengthRating(trainingWatch.getTrainingLength()) + burnedKcalRating(trainingWatch.getCaloriesBurned()) + avgBpmRating(trainingWatch.getAveragePulse())) / 6;
        System.out.println("Your rating is: " + overallRating);


    }
    public static int lengthRating(int length){
        if (length < 30) return 1;
        if (length >= 30 && length <= 60) return 2;
        if (length > 60) return 3;
        else return 0;
    }

    public static int burnedKcalRating(int burnedCalories){
        if (burnedCalories <= 300) return 1 * 2;
        if (burnedCalories > 300 && burnedCalories < 400) return 2 * 2;
        if (burnedCalories >= 400) return 3 * 2;
        else return 0;
    }

    public static int avgBpmRating(int bpm){
        if (bpm > 175) return 1 * 3;
        if (bpm >= 160 && bpm <= 175) return 2 * 3;
        if (bpm < 160) return 3 * 3;
        else return 0;
    }

    public static int overallRating(int length, int burnedKcal, int bpm){
        int lengthRating = lengthRating(length);
        int burnedKcalRating = burnedKcalRating(burnedKcal);
        int bpmRating = avgBpmRating(bpm);
        return (lengthRating + burnedKcalRating + bpmRating) / 6;
    }

}
