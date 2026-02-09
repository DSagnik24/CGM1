package RateLimiterSystem;

public class Main {

    public static void main(String[] args) {

        IEventStore store = new EventStoreImpl();

        EventRateLimiter limiter =
                new EventRateLimiter(store, 3);

        limiter.registerEvent(EventType.LOGIN);
        limiter.registerEvent(EventType.FILE_UPLOAD);
        limiter.registerEvent(EventType.LOGIN); // triggers store

        limiter.registerEvent(EventType.LOGOUT);
        limiter.registerEvent(EventType.LOGIN);

        System.out.println("Pending: "
                + limiter.getPendingEventCount());

        System.out.println("Total: "
                + limiter.getTotalEventCount());

        System.out.println("Most Frequent: "
                + limiter.getMostFrequentEventTypes());

        System.out.println("Above Threshold(2): "
                + limiter.getEventsAboveThreshold(2));
    }
}

