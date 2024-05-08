/**
 * A class implementing the Calculate interface to calculate total cost and compare competition weight category.
 */
public class Cost implements Calculate {

    @Override
    /**
     * Calculates the total cost for the athlete based on their training plan, coaching hours, and number of competitions.
     * @param athlete The athlete for whom the total cost is to be calculated.
     * @return The total cost calculated based on the athlete's attributes.
     */
    public double calculateTotalCost(Athlete athlete) {
        // Determine the fee of the week based on the athlete's training plan
        int feeOfWeek = (athlete.getTrainingPlan().equals(TrainingPlan.Beginner)) ? 25
                : (athlete.getTrainingPlan().equals(TrainingPlan.Intermediate)) ? 30 : 35;
        double coachingHr = athlete.getNoOfCoachingHr();
        double noOfCompetition = athlete.getNoOfCompetition();
        // Calculate the total cost based on the formula
        return ((feeOfWeek + (9 * coachingHr)) * 4) + (22 * noOfCompetition);
    }

    @Override
    /**
     * Compares the athlete's competition weight category with their current weight and returns the difference in kilograms.
     * @param athlete The athlete for whom the competition weight category is to be compared.
     * @return The difference between the competition weight category and the current weight of the athlete, in kilograms.
     */
    public double compareCompetitonWeightCat(Athlete athlete) {
        // Calculate the difference between competition weight category and current weight
        return athlete.getCompetitionWeightCat() - athlete.getCurrentWeightKG();
    }
}
