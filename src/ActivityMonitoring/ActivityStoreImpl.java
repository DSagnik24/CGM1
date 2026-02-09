package ActivityMonitoring;

import java.util.LinkedList;
import java.util.Queue;

public class ActivityStoreImpl implements IActivityStore {

    private Queue<ActivityType> database = new LinkedList<>();

    @Override
    public void storeActivities(Queue<ActivityType> activities) {

        // Moves activities from queue → database
        while(!activities.isEmpty()){
            database.add(activities.poll());
        }
    }

    @Override
    public int getTotalStoredActivities() {
        return database.size();
    }
}

