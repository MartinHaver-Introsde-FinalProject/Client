import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.net.*;
import ws.Goal;
import ws.HealthMeasure;
import ws.HealthMeasureHistory;
import ws.Activity;
import ws.ActivitySelection;
import ws.People;
import ws.PeopleService;
import ws.Person;

public class PeopleClient {
	private final static int idPerson = 1;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();
		List<Activity> searchingListOfActivities = new ArrayList<Activity>();
		List<Activity> suggestionActivities = new ArrayList<Activity>();
		Person person = people.getPersonById(idPerson);

		while (true) {
			System.out.println("Welcome! This is the console of your personal healthy lifestyle information system.");	
			System.out.println("Changing the lifestyle takes considerable effort, but I believe this app will help you to stay on the right path.");
			System.out.println("Now, choose your action please:");
			System.out.println("\n");
			System.out.println("1: Show person information.");
			System.out.println("2: Update your health profile.");
			System.out.println("3: Create new goal.");
			System.out.println("4: Motivate me!");
			System.out.println("5: Get suggestion for activities and select activity for exercise.");
			System.out.println("6: Search for activities and select activity for exercie.");
			System.out.println("7: Update time of the current activity.");
			System.out.println("8: Show health measure histories.");
			System.out.println("9: Show goal histories.");
			System.out.println("To quit this program, please type 'quit'");
			input = br.readLine();
			if (input.equals("quit")) {
				System.exit(0);
			} else {
				switch (input) {
				case "1":
					write(person);
					break;
				case "2":
					System.out.print("Height: "); input = br.readLine();
					double height = Double.parseDouble(input);
					System.out.print("Weight: "); input = br.readLine();
					double weight = Double.parseDouble(input);
					System.out.print("age: "); input = br.readLine();
					int age = Integer.parseInt(input);
					person = people.updateHealthMeasure(idPerson, height, weight, age);
					break;
				case "3":
					person = people.createNewGoal(idPerson);
					break;
				case "4":
					URL oracle = new URL("https://safe-ravine-27770.herokuapp.com/blogic/motivation");
			        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
			        String inputLine;
			        String newLine = System.getProperty("line.separator");
			        System.out.println("***************************************************************************************************");
			        while ((inputLine = in.readLine()) != null)
			        	System.out.println("Your quote:" + newLine + inputLine + newLine + "Keep up the good work!" );
			        	in.close();
			        System.out.println("***************************************************************************************************");
			        break;
				case "5":
					suggestionActivities = people.suggestActivities(idPerson);
					writeActivities(suggestionActivities);
					System.out.print("Enter the activity ID(to exit enter q): "); input = br.readLine();
					if (input.equals("quit")) {
						break;
					} else {
						int select = Integer.parseInt(input);
						for (Activity activity : suggestionActivities) {
							if (activity.getIdActivity() == select) {
								person = people.addActivityToGoal(idPerson, activity);
							}
						}
					}
					break;
				case "6":
					System.out.print("Enter your activity type: "); input = br.readLine();
					searchingListOfActivities = people.searchActivities(idPerson, input);
					writeActivities(searchingListOfActivities);
					System.out.print("Enter the activity ID(to exit enter q): "); input = br.readLine();
					if (input.equals("quit")) {
						break;
					} else {
						int select = Integer.parseInt(input);
						for (Activity activity : searchingListOfActivities) {
							if (activity.getIdActivity() == select) {
								person = people.addActivityToGoal(idPerson, activity);
							}
						}
					}
					break;
				case "7":
					System.out.print("Enter activity time(hour): "); input = br.readLine();
					double time = Double.parseDouble(input);
					for (Goal goal: person.getGoals().getGoals()) {
						if (goal.getCurrent() == 1) {
							for (ActivitySelection activitySelection : goal.getActivitySelections().getActivitySelections()) {
								if (activitySelection.getCurrent() == 1) {
									ActivitySelection tmpActivitySelection = activitySelection;
									tmpActivitySelection.setTime(time);
									person = people.updateTimeForActivitySelection(idPerson, tmpActivitySelection);
								}
							}
						}
					}
					break;
				case "8":
					List<HealthMeasureHistory> healthMeasureHistories = people.getMeasureHistories(idPerson);
					writeHealthMeasureHistories(healthMeasureHistories);
					break;
				case "9":
					List<Goal> goals = people.getGoalHistories(idPerson);
					writeGoals(goals);
					break;
				}			
			}
		}
	}

	public static void writeHealthMeasureHistories(List<HealthMeasureHistory> healthMeasureHistories) {
		System.out.println("HEALTH HISTORIES INFORMATION:");
		System.out.println("*************************************************");
		for (HealthMeasureHistory healthMeasureHistory : healthMeasureHistories) {
			System.out.format("%1s%15s%30f%20s%3s\n", "*", healthMeasureHistory.getMeasureDefinition().getMeasureName() + ": ", healthMeasureHistory.getValue(), healthMeasureHistory.getTimestamp(), "*");
		}
		System.out.println("*************************************************");
	}
	
	public static void writeGoals(List<Goal> goals) {
		System.out.println("GOAL HISTORIES INFORMATION:");
		System.out.println("*********************************************************************");
		for (Goal goal : goals) {
			System.out.format("%1s%25s%40s%3s\n", "*", "Name: ", goal.getGoalName(), "*");
			System.out.format("%1s%25s%40s%3s\n", "*", "Date: ", goal.getDate(), "*");
			System.out.format("%1s%25s%40f%3s\n", "*", "Ideal BMI: ", goal.getIdealBmi(), "*");
			System.out.format("%1s%25s%40f%3s\n", "*", "Ideal Weight: ", goal.getIdealWeight(), "*");
			System.out.format("%1s%25s%40f%3s\n", "*", "Shaved Calories: ", goal.getShavedCalories(), "*");
			
			System.out.println("***************************************************************************************************");
			System.out.println("ACTIVITIES INFORMATION:");
			System.out.println("***************************************************************************************************");
			for (ActivitySelection activitySelection : goal.getActivitySelections().getActivitySelections()) {
				System.out.format("%1s%25s%70s%3s\n", "*", "Name: ", activitySelection.getActivity().getActivityName(),	"*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Time: ", activitySelection.getTime(), "*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Used Calories: ", activitySelection.getUsedCalories(), "*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Rate Calories/Hour: ",
						activitySelection.getActivity().getCaloriesPerHour(), "*");
				System.out.println("--------------------------------------------------------------------------------------------------");
			}
			System.out.println("***************************************************************************************************");
		}
	}
	
	public static void write(Person person) {
		System.out.println("PERSONAL INFORMATION:");
		System.out.println("*************************************************");
		System.out.format("%1s%15s%30d%3s\n", "*", "ID: ", person.getIdPerson(), "*");
		System.out.format("%1s%15s%30s%3s\n", "*", "Name: ", (person.getFirstname() + " " + person.getLastname()), "*");
		System.out.format("%1s%15s%30s%3s\n", "*", "Birthdate: ", person.getBirthdate(), "*");
		System.out.format("%1s%15s%30s%3s\n", "*", "Sex: ", (person.getSex() == 1) ? "Male" : "Female", "*");
		System.out.println("*************************************************");
		
		System.out.println("HEALTH INFORMATION:");
		System.out.println("*************************************************");
		for (HealthMeasure healthMeasure : person.getHealthMeasures().getHealthMeasures()) {
			System.out.format("%1s%15s%30f%3s\n", "*", healthMeasure.getMeasureDefinition().getMeasureName() + ": ", healthMeasure.getValue(), "*");
		}
		System.out.println("*************************************************");
		
		System.out.println("GOAL INFORMATION:");
		System.out.println("*********************************************************************");
		for (Goal goal : person.getGoals().getGoals()) {
			if (goal.getCurrent() == 1) {
				System.out.format("%1s%25s%40s%3s\n", "*", "Name: ", goal.getGoalName(), "*");
				System.out.format("%1s%25s%40s%3s\n", "*", "Date: ", goal.getDate(), "*");
				System.out.format("%1s%25s%40f%3s\n", "*", "Ideal BMI: ", goal.getIdealBmi(), "*");
				System.out.format("%1s%25s%40f%3s\n", "*", "Ideal Weight: ", goal.getIdealWeight(), "*");
				System.out.format("%1s%25s%40f%3s\n", "*", "Shaved Calories: ", goal.getShavedCalories(), "*");
				
				System.out.println("***************************************************************************************************");
				System.out.println("ACTIVITIES INFORMATION:");
				System.out.println("***************************************************************************************************");
				for (ActivitySelection activitySelection : goal.getActivitySelections().getActivitySelections()) {
					System.out.format("%1s%25s%70s%3s\n", "*", "Name: ", activitySelection.getActivity().getActivityName(), "*");
					System.out.format("%1s%25s%70f%3s\n", "*", "Time: ", activitySelection.getTime(), "*");
					System.out.format("%1s%25s%70f%3s\n", "*", "Used Calories: ", activitySelection.getUsedCalories(), "*");
					System.out.format("%1s%25s%70f%3s\n", "*", "Rate Calories/Hour: ", activitySelection.getActivity().getCaloriesPerHour(), "*");
					System.out.println("--------------------------------------------------------------------------------------------------");
				}
				System.out.println("***************************************************************************************************");
			}
		}
	}
	
	public static void writeActivities(List<Activity> activities) {
		if (activities != null) {
			System.out.println("ACTIVITIES INFORMATION:");
			System.out.println("***************************************************************************************************");
			for (Activity activity : activities) {
				System.out.format("%1s%25s%70d%3s\n", "*", "ID: ", activity.getIdActivity(),"*");
				System.out.format("%1s%25s%70s%3s\n", "*", "Name: ", activity.getActivityName(),"*");
				System.out.format("%1s%25s%70s%3s\n", "*", "Type: ", activity.getActivityType(), "*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Used Calories: ", activity.getCaloriesPerHour(), "*");
				System.out.println("--------------------------------------------------------------------------------------------------");
			}
			System.out.println("***************************************************************************************************");
		}
	}
}
