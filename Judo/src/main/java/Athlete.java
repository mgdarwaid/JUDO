import java.text.DecimalFormat;

/**
 * Class representing an athlete.
 */
public class Athlete {

    /**
     * The name of the athlete.
     */
    private String name = "";

    /**
     * The training plan of the athlete.
     */
    private TrainingPlan trainingPlan = TrainingPlan.Beginner;

    /**
     * The current weight of the athlete in kilograms.
     */
    private double currentWeightKG = 0;

    /**
     * The competition weight category of the athlete in kilograms.
     */
    private double competitionWeightCat = 0;

    /**
     * The number of competitions the athlete has participated in.
     */
    private int noOfCompetition = 0;

    /**
     * The number of coaching hours the athlete has received.
     */
    private double noOfCoachingHr = 0;

    /**
     * The total cost incurred by the athlete.
     */
    private double totalCost = 0.00;

    // Getters and setters for all Attributes

    /**
     * Get the name of the athlete.
     * 
     * @return The name of the athlete.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the athlete.
     * 
     * @param name The name of the athlete.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the training plan of the athlete.
     * 
     * @return The training plan of the athlete.
     */
    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    /**
     * Set the training plan of the athlete.
     * 
     * @param trainingPlan The training plan of the athlete.
     */
    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    /**
     * Get the current weight of the athlete.
     * 
     * @return The current weight of the athlete.
     */
    public double getCurrentWeightKG() {
        // Format current weight to two decimal places
        DecimalFormat de = new DecimalFormat("#.00");
        return Double.parseDouble(de.format(currentWeightKG));
    }
    /**
     * Set the current weight of the athlete.
     * 
     * @param currentWeightKG The current weight of the athlete.
     */
    public void setCurrentWeightKG(double currentWeightKG) {
        this.currentWeightKG = currentWeightKG;
    }
    /**
     * Get the competition weight category of the athlete.
     * 
     * @return The competition weight category of the athlete.
     */
    public double getCompetitionWeightCat() {
        // Format competition weight category to two decimal places
        DecimalFormat de = new DecimalFormat("#.00");
        return Double.parseDouble(de.format(competitionWeightCat));
    }
    /**
     * Set the competition weight category of the athlete.
     * 
     * @param competitionWeightCat The competition weight category of the athlete.
     */
    public void setCompetitionWeightCat(double competitionWeightCat) {
        this.competitionWeightCat = competitionWeightCat;
    }
    /**
     * Get the number of competitions the athlete has participated in.
     * 
     * @return The number of competitions the athlete has participated in.
     */
    public int getNoOfCompetition() {
        return noOfCompetition;
    }

    /**
     * Set the number of competitions the athlete has participated in.
     * 
     * @param noOfCompetition The number of competitions the athlete has participated in.
     */
    public void setNoOfCompetition(int noOfCompetition) {
        this.noOfCompetition = noOfCompetition;
    }

    /**
     * Get the number of coaching hours the athlete has received.
     * 
     * @return The number of coaching hours the athlete has received.
     */
    public double getNoOfCoachingHr() {
        return noOfCoachingHr;
    }

    /**
     * Set the number of coaching hours the athlete has received.
     * 
     * @param noOfCoachingHr The number of coaching hours the athlete has received.
     */
    public void setNoOfCoachingHr(double noOfCoachingHr) {
        this.noOfCoachingHr = noOfCoachingHr;
    }

    /**
     * Get the total cost incurred by the athlete.
     * 
     * @return The total cost incurred by the athlete.
     */
    public double getTotalCost() {
        // Format total cost to two decimal places
        DecimalFormat decfor = new DecimalFormat("#.00");
        return Double.parseDouble(decfor.format(totalCost));
    }
    /**
     * Set the total cost incurred by the athlete.
     * 
     * @param totalCost The total cost incurred by the athlete.
     */
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
