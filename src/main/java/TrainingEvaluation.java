public class TrainingEvaluation{
    public static int lengthRating(int length){
        if (length < 30 && length > 0) return 1;
        if (length >= 30 && length <= 60) return 2;
        if (length > 60) return 3;
        else return 0;
    }

    public static int burnedKcalRating(int burnedCalories){
        if (burnedCalories <= 300 && burnedCalories > 0) return 1 * 2;
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

    public static float overallRating(int length, int burnedKcal, int bpm){
        float lengthRating = lengthRating(length);
        float burnedKcalRating = burnedKcalRating(burnedKcal);
        float bpmRating = avgBpmRating(bpm);
        return (lengthRating + burnedKcalRating + bpmRating) / 6;
    }

    public static void trainingEfficiency(float overallRating){
        if (overallRating < 1.2f) System.out.println("Low efficiency");
        if (overallRating >= 1.2f && overallRating < 2) System.out.println("Good efficiency");
        if (overallRating >= 2 && overallRating < 3) System.out.println("Very good efficiency");
        if (overallRating == 3) System.out.println("Excellent efficiency");
    }
}
