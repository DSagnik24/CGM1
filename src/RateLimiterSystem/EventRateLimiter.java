package RateLimiterSystem;
import java.util.*;

public class EventRateLimiter {

    private IEventStore store;
    private int L;

    // THINK about which DS to use 🙂
    private Queue<EventType> queue;
    private Map<EventType, Integer> freqMap;
    private int totalLoggedActions = 0;

    //------------------------------------------------

    public EventRateLimiter(IEventStore store, int L) {

        this.store = store;
        this.L = L;

        // initialize collections
        this.queue = new LinkedList<>();
        this.freqMap = new HashMap<>();
        this.totalLoggedActions = 0;
    }

    //------------------------------------------------

    public void registerEvent(EventType type) {

        // STEP 1 → add to queue
        queue.offer(type);

        // STEP 2 → update frequency
        freqMap.put(type,freqMap.getOrDefault(type,0)+1);
        totalLoggedActions++;

        // STEP 3 → if queue size == L
        if(queue.size() == L){

            // send to store
             store.storeEvents(queue);
        }


    }

    //------------------------------------------------

    public int getPendingEventCount() {

        return queue.size();
    }

    //------------------------------------------------

    public int getTotalEventCount() {

        // stored + pending
        return totalLoggedActions;
    }

    //------------------------------------------------

    public List<EventType> getMostFrequentEventTypes() {

        // find max
        int max =Integer.MIN_VALUE;

        for(int val : freqMap.values()){
            max = Math.max(max,val);
        }
        // collect
        List<EventType> res = new ArrayList<>();

        for(Map.Entry<EventType, Integer>entry: freqMap.entrySet()){
            if(entry.getValue() == max){
                res.add(entry.getKey());
            }
        }
        // sort
        Collections.sort(res);
        return res;
    }

    //------------------------------------------------

    // 🔥 NEW TWIST (Harder than previous problems)

    public List<EventType> getEventsAboveThreshold(int threshold) {

        // return events whose freq >= threshold
        List<EventType> res = new ArrayList<>();

        for(Map.Entry<EventType,Integer>e:freqMap.entrySet()){
            if(e.getValue()>=threshold){
                res.add(e.getKey());
            }
        }
        // sorted
        Collections.sort(res);
        // NEVER return null

        return res;
    }
}

