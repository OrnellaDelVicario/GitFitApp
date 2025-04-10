import java.util.ArrayList;
import java.util.List;

public class WorkoutHistory {
    private List<String> history = new ArrayList<>();

    public void addLog(String exercise, int minutes) {
        String log = exercise + " - " + minutes + " min";
        history.add(log);
        System.out.println("Added to history: " + log);
    }

    public void showHistory() {
        System.out.println("\n--- Workout History ---");
        if (history.isEmpty()) {
            System.out.println("No workouts logged yet.");
        } else {
            for (String entry : history) {
                System.out.println(entry);
            }
        }
    }
}
