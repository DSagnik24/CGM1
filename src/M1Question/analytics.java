package M1Question;

import java.util.*;

public class analytics {
    private IanalyticsStore analyticsStore;
    private int K;

    private Queue<ActionEnum> queue;
    private Map<ActionEnum ,Integer> freq;
    private int totalLoggedActions;

    public analytics(IanalyticsStore analyticsStore, int K){
        this.analyticsStore = analyticsStore;
        this.K = K;
        this.queue = new LinkedList<>();
        this.freq = new HashMap<>();
        this.totalLoggedActions = 0;
    }

    public void registerAction(ActionEnum action){
        queue.offer(action);

        freq.put(action,freq.getOrDefault(action,0)+1);
        totalLoggedActions++;

        if(queue.size() == K){
            analyticsStore.storeActions(new LinkedList<>(queue));
            queue.clear();
        }
    }
    public int getNumberOfActionsRegisteredButNotSentToAnalyticsStore() {
        return queue.size();
    }

    public int gettotalnumberofLoggedActions() {
        return totalLoggedActions;
    }

    // Most frequent
    public List<ActionEnum> getMostFrequentlyUsedAction() {

        int max = 0;

        for(int val : freq.values()) {
            max = Math.max(max, val);
        }

        List<ActionEnum> result = new ArrayList<>();

        for(Map.Entry<ActionEnum, Integer> entry : freq.entrySet()) {
            if(entry.getValue() == max) {
                result.add(entry.getKey());
            }
        }

        result.sort(Comparator.comparing(Enum::name));

        return result;
    }
}
