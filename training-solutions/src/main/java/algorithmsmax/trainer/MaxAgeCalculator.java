package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer tempTrainer = null;
        for (Trainer coach : trainers) {
            if (tempTrainer == null || tempTrainer.getAge() < coach.getAge()) {
                tempTrainer = coach;
            }
        }
        return tempTrainer;
    }
}
