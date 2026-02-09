package API_RequestBatchingSystem;

import java.util.*;

class ApiRequestTracker implements IApiRequestTracker {

    private IRequestStore requestStore;
    private int M;

    private Queue<RequestType> queue;
    private Map<RequestType, Integer> freq;
    private int totalRequests;

    public ApiRequestTracker(IRequestStore requestStore, int m) {
        this.requestStore= requestStore;
        this.M=m;
        this.queue=new LinkedList<>();
        this.freq = new HashMap<>();
        this.totalRequests = 0;
    }

    public void registerRequest(RequestType request) {
        queue.offer(request);

        freq.put(request, freq.getOrDefault(request,0)+1);

        totalRequests++;

        if(queue.size() == M){
            requestStore.storeRequests(new LinkedList<>(queue));
            queue.clear();
        }
    }

    public int getPendingRequests() {
        return queue.size();
    }

    public int getTotalRequests() {
        return totalRequests;
    }

    public List<RequestType> getMostFrequentRequests() {
        int maxFreq = 0;

        for(int val:freq.values()){
            maxFreq = Math.max(maxFreq, val);
        }

        List<RequestType> res = new ArrayList<>();

        for(Map.Entry<RequestType,Integer>entry: freq.entrySet()){
            if(entry.getValue() == maxFreq){
                res.add(entry.getKey());
            }
        }
        res.sort(Comparator.comparing(Enum::name));
        return res;
    }
}

