public class ActivityTracker {
    private int goal;
    private int sessions;
    private int totalMinutes;
    private int maxMinutes;

    public ActivityTracker(int goal) {
        this.goal = goal;
        sessions = 0;
        totalMinutes = 0;
        maxMinutes = 0;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public int getMaxMinutes() {
        return maxMinutes;
    }

    public int getSessions() {
        return sessions;
    }

    public void logMinutes(int minutes) {
        totalMinutes += minutes;
        sessions++;
        if (maxMinutes < minutes) {
            maxMinutes = minutes;
        }
    }

    public boolean goalAchieved() {
        if (totalMinutes >= goal) {
            return true;
        }
        return false;
    }
}