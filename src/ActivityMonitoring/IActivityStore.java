package ActivityMonitoring;

import java.util.Queue;

public interface IActivityStore {

    void storeActivities(Queue<ActivityType> activities);

    int getTotalStoredActivities();
}
