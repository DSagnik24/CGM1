package NotificationSystem_M1;

import java.util.*;

public class NotificationTracker {

    private INotificationStore store;
    private int N;

    // YOU WILL NEED THESE DATA STRUCTURES
    private Queue<NotificationType> queue;
    private Map<NotificationType, Integer> freqMap;

    // OPTIONAL BUT SMART
    private int totalNotifications;

    public NotificationTracker(INotificationStore store, int N) {

        this.store = store;
        this.N = N;

        // initialize collections
        this.queue = new LinkedList<>();
        this.freqMap = new HashMap<>();
    }

    //------------------------------------------------

    public void registerNotification(NotificationType type) {


        // STEP 1: add to queue
        queue.offer(type);

        // STEP 2: update frequency
        freqMap.put(type,freqMap.getOrDefault(type,0)+1);


        // STEP 3:
        // if queue size == N
        if(queue.size() == N){
            store.storeNotifications(queue);
        }
        // send to store
    }

    //------------------------------------------------

    public int getPendingNotificationsCount() {

        // return queue size
        return queue.size();
    }

    //------------------------------------------------

    public int getTotalNotificationsCount() {

        // pending + stored
        return queue.size()+store.getTotalStoredNotifications();
    }

    //------------------------------------------------

    public List<NotificationType> getMostFrequentNotifications() {

        int max = 0;
        // find max frequency
        for(Map.Entry<NotificationType, Integer> entry: freqMap.entrySet()){
            max = Math.max(max, entry.getValue());
        }

        // return sorted list
        List<NotificationType> list = new ArrayList<>();

        for(Map.Entry<NotificationType,Integer> entry: freqMap.entrySet()){
            if(entry.getValue() == max){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);

        return list;
    }
}

