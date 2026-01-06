import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your goal in minutes: ");
        int goal = scan.nextInt();

        ActivityTracker log = new ActivityTracker(goal);
        while (!log.goalAchieved()) {
            System.out.print("Enter the number of minutes for your activity session: ");
            int time = scan.nextInt();
            log.logMinutes(time);
            System.out.println("---- Current Stats ----");
            System.out.println("Number of sessions: " + log.getSessions());
            System.out.println("Total number of minutes: " + log.getTotalMinutes());
            System.out.println("Longest session logged (max minutes): " + log.getMaxMinutes());
            System.out.println("You reached your goal: " + log.goalAchieved());
            System.out.println("-----------------------");
        }
        System.out.println("Thank you for using the activity tracker!");
    }
}