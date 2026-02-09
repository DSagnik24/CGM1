package ActivityMonitoring;

package ActivitySystem;

import java.util.*;

public class ActivityMonitor {

    private IActivityStore store;
    private int M;

    // YOU SHOULD USE THESE
    private Queue<ActivityType> queue;
    private Map<ActivityType, Integer> freqMap;
    //------------------------------------------------

    public ActivityMonitor(IActivityStore store, int M) {

        this.store = store;
        this.M = M;

        // initialize collections
        this.queue = new LinkedList<>();
        this.freqMap = new HashMap<>();

    }

    //------------------------------------------------

    public void registerActivity(ActivityType type) {

        // STEP 1 → add to queue
        queue.offer(type);

        // STEP 2 → update frequency
        freqMap.put(type, freqMap.getOrDefault(type,0)+1);
        // STEP 3 → if queue size == M
        if(queue.size() == M){
            store.storeActivities(queue);
        }
        // send to store
    }

    //------------------------------------------------

    public int getPendingActivityCount() {

        return queue.size();
    }

    //------------------------------------------------

    public int getTotalActivityCount() {

        // pending + stored
        return queue.size() + store.getTotalStoredActivities();
    }

    //------------------------------------------------

    public List<ActivityType> getMostFrequentActivities() {

        int max = 0;

        // find max
        for(Map.Entry<ActivityType,Integer>entry:freqMap.entrySet()){
            max = Math.max(max, entry.getValue());
        }
        List<ActivityType> res = new ArrayList<>();
        // collect
        for(Map.Entry<ActivityType,Integer>entry:freqMap.entrySet()){
            if(entry.getValue() == max){
                res.add(entry.getKey());
            }
        }
        // sort
        Collections.sort(res);
        return res;
    }

    //------------------------------------------------

    // 🔥 NEW TWIST (slightly harder)

    public List<ActivityType> getLeastFrequentActivities() {

        // find min (ignore zero)
        int min = 0;
        for(Map.Entry<ActivityType,Integer>entry:freqMap.entrySet()){
            min = Math.min(min, entry.getValue());
        }
        // collect

        List<ActivityType> res = new ArrayList<>();
        for(Map.Entry<ActivityType,Integer>entry:freqMap.entrySet()){
            if(entry.getValue() == min){
                res.add(entry.getKey());
            }
        }
        // sort
        Collections.sort(res);

        return res;
    }
}

