package RateLimiterSystem;

import java.util.LinkedList;
import java.util.Queue;

public class EventStoreImpl implements IEventStore {

    private Queue<EventType> database = new LinkedList<>();

    @Override
    public void storeEvents(Queue<EventType> events) {

        // Moves events from queue → database
        while(!events.isEmpty()){
            database.add(events.poll());
        }
    }

    @Override
    public int getTotalStoredEvents() {
        return database.size();
    }
}

