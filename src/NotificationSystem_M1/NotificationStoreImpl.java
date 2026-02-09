package NotificationSystem_M1;

import java.util.LinkedList;
import java.util.Queue;

public class NotificationStoreImpl implements INotificationStore {

    private Queue<NotificationType> database = new LinkedList<>();

    @Override
    public void storeNotifications(Queue<NotificationType> notifications) {

        while(!notifications.isEmpty()){
            database.add(notifications.poll());
        }
    }

    @Override
    public int getTotalStoredNotifications() {
        return database.size();
    }
}

