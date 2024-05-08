import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JUDO {
	/* Scanner object for user input */
	static Scanner n = new Scanner(System.in);

	// Main method
	public static void main(String[] args) throws IOException {
		int maxUser = 1;// set max user input
		double compWeigtCat = 0;// to store the competition weight value from input
		double CurrentWeightKG = 0;//
		// List to store athlete objects
		List<Athlete> players = new ArrayList<>();

		System.out.println("*** Welcome to JUDO ***\n");
		// Loop to input data for each player
		for (int i = 0; i < maxUser; i++) {
			// Create a Cost object
			Calculate calculate = new Cost();
			// Create a new Athlete object
			Athlete athlete = new Athlete();

			// Input player name
			athlete.setName(inputName());
			// Input training plan
			athlete.setTrainingPlan(inputTrainingPlan());
			// Input current weight in kilograms
			CurrentWeightKG = inputWeightinKG();
			// Determine current weight category
			athlete.setCurrentWeightKG(CurrentWeightKG);
			String weight = (CurrentWeightKG <= 66) ? "FlyWeight"
					: (CurrentWeightKG <= 73) ? "LightWeight"
							: (CurrentWeightKG <= 81) ? "Light-MiddleWeight"
									: (CurrentWeightKG <= 90) ? "MiddleWeight"
											: (CurrentWeightKG <= 100) ? "Ligh-HeavyWeight" : "HeavyWeight";

			System.out.println("Your current weight category : " + weight);
			// Determine competition weight category
			compWeigtCat = inputCompetitionWeightCat();
			athlete.setCompetitionWeightCat(compWeigtCat);

			String cat = (compWeigtCat <= 66) ? "FlyWeight"
					: (compWeigtCat <= 73) ? "LightWeight"
							: (compWeigtCat <= 81) ? "Light-MiddleWeight"
									: (compWeigtCat <= 90) ? "MiddleWeight"
											: (compWeigtCat <= 100) ? "Ligh-HeavyWeight" : "HeavyWeight";

			System.out.println("Your competition weight category : " + cat);
			// Input number of competitions
			if (athlete.getTrainingPlan() != TrainingPlan.Beginner) {

				athlete.setNoOfCompetition(inputNoOfCompetition());
			}
			// Input number of coaching hours
			athlete.setNoOfCoachingHr(inputNoOfCoachingHr(athlete.getTrainingPlan()));
			// Calculate total cost
			athlete.setTotalCost(calculate.calculateTotalCost(athlete));

			// Compare competition weight category
			calculate.compareCompetitonWeightCat(athlete);
			// Add athlete to the list
			players.add(athlete);
			// Display athlete information
			System.out.println("\n");
			System.out.println("Your name is : ** " + athlete.getName() + " **");
			System.out.println("Your training plan is : ** " + athlete.getTrainingPlan() + " **");
			System.out
					.println("Your current weight is : ** " + athlete.getCurrentWeightKG() + " kg" + " ** , " + weight);
			System.out.println(
					"Your competition weight is : ** " + athlete.getCompetitionWeightCat() + " kg" + " ** , " + cat);
			System.out.println("Your competitions entered this month is : ** " + athlete.getNoOfCompetition() + " **");
			System.out.println("Your pravite choaching hour is : ** " + athlete.getNoOfCoachingHr() + " **");
			System.out.println("Your total cost : ** " + athlete.getTotalCost() + " **");
			System.out.println(
					"Your compare competition weigt : ** " + calculate.compareCompetitonWeightCat(athlete) + " kg");

		}

		// Finish message
		System.out.println("Finished");
	}

	/* Method to input player name */
	public static String inputName() throws IOException {
		String name;

		System.out.print("Enter player name : ");
		name = n.nextLine();
		// Validate the input
		while (name.isEmpty()) {
			System.out.print("Name cannot be empty! Re-enter again : ");
			name = n.nextLine();
			
		}

		return name;
	}

	/* Method to input player training paln */
	public static TrainingPlan inputTrainingPlan() throws IOException {

		String trainingPlan = "";
		// Prompt for training plan selection
		String st = "\nChoose a training plan\n 1: Beginner, 2: Intermediate and 3: Elite ::";

		boolean flag = false;
		int tempInt = 0;
		// Loop until valid input is received
		do {

			System.out.print(st);
			trainingPlan = n.nextLine();

			flag = checking.checkNum(trainingPlan);
			// Validate the input
			if (!flag) {
				st = "\nInput Number Type Please...\nChoose a training plan\n 1: Beginner, 2: Intermediate and 3: Elite ::";
				continue;
			}

			tempInt = Integer.parseInt(trainingPlan);//

			flag = checking.checkRange(1, 3, tempInt);//

			if (!flag) {
				st = "\nInvalid Number (1-3)...\nChoose a training plan\n 1: Beginner, 2: Intermediate and 3: Elite ::";
				continue;
			}

		} while (!flag);
		// Return the selected training plan
		if (tempInt == 1)
			return TrainingPlan.Beginner;
		else if (tempInt == 2)
			return TrainingPlan.Intermediate;
		else
			return TrainingPlan.Elite;

	}

	/* Method to input current weight in kilograms */
	public static double inputWeightinKG() throws IOException {
		String input;
		System.out.println(
				"\nHeavyweight=Unlimited(over 100)\nLight-Heavyweight=100\nMiddleweight=90\nLight-Middleweight=81\nLightweight=73\nFlyweight=66\n");
		System.out.print("Enter Current Weight in kg: ");
		input = n.nextLine();
		// Validate the input
		while (!checking.checkNum(input)) {

			System.out.print("\nInvalid input!!!\nEnter Current Weight in kg again: ");
			input = n.nextLine();

		}

		return Double.parseDouble(input);

	}

	/* Method to input competition weight category */
	private static double inputCompetitionWeightCat() throws IOException {
		String input;
		System.out.println(
				"\nHeavyweight=Unlimited(over 100)\nLight-Heavyweight=100\nMiddleweight=90\nLight-Middleweight=81\nLightweight=73\nFlyweight=66\n");
		System.out.print("Enter Competition Weight Category :");
		input = n.nextLine();
		// Validate the input
		while (!checking.checkNum(input)) {

			System.out.print("\nInvalid input!!!\nEnter Competition Weight Category again: ");
			input = n.nextLine();

		}

		return Double.parseDouble(input);
	}

	/* Method to input number of competitions */
	public static int inputNoOfCompetition() throws IOException {
		String input;

		System.out.print("Enter number of competitions:");
		input = n.nextLine();
//Validate the input
		while (!checking.checkNum(input)) {

			System.out.print("Invalid input!!!\nEnter number of competitions again: ");
			input = n.nextLine();
		System.out.println();

		}

		return Integer.parseInt(input);
	}

// Method to input number of coaching hours
	public static double inputNoOfCoachingHr(TrainingPlan trainingPlan) throws IOException {
		String input;
		boolean flag = false;
		double tempInt = 0;
		int max = 5;

		String promptText = "Enter number of private coaching hour:";
		// loop until valid input is received
		do {
			System.out.print(promptText);
			input = n.nextLine();
			flag = checking.checkNum(input);

			if (!flag) {
				promptText = "\nInput Number Type Please...\nEnter number of private coaching hour:";
				continue;
			}

			tempInt = Double.parseDouble(input);

			if (tempInt > max) {
				promptText = "\nMaximun coaching hour for " + trainingPlan + " is 0-" + max + " per week"
						+ "\n Enter number of private coaching hour again:";
				flag = false;
				continue;
			}

		} while (!flag);

		return tempInt;
	}

}
