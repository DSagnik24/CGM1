package NotificationSystem_M1;

public class Main {

    public static void main(String[] args) {

        INotificationStore store = new NotificationStoreImpl();

        NotificationTracker tracker =
                new NotificationTracker(store, 3);

        tracker.registerNotification(NotificationType.EMAIL);
        tracker.registerNotification(NotificationType.SMS);
        tracker.registerNotification(NotificationType.EMAIL);

        // should trigger store

        tracker.registerNotification(NotificationType.PUSH);
        tracker.registerNotification(NotificationType.EMAIL);

        System.out.println("Pending: "
                + tracker.getPendingNotificationsCount());

        System.out.println("Total: "
                + tracker.getTotalNotificationsCount());

        System.out.println("Most Frequent: "
                + tracker.getMostFrequentNotifications());
    }
}

