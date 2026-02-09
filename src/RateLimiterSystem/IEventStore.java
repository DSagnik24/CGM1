package RateLimiterSystem;

import java.util.Queue;

public interface IEventStore {

    void storeEvents(Queue<EventType> events);

    int getTotalStoredEvents();
}

