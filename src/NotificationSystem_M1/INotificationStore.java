package NotificationSystem_M1;

import java.util.Queue;

public interface INotificationStore {

    void storeNotifications(Queue<NotificationType> notifications);

    int getTotalStoredNotifications();
}

