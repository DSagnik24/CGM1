package API_RequestBatchingSystem;

import java.util.*;

class RequestStore implements IRequestStore {

    private List<RequestType> database = new ArrayList<>();

    @Override
    public void storeRequests(Queue<RequestType> requests) {

        while(!requests.isEmpty()) {
            database.add(requests.poll());
        }
    }

    public List<RequestType> getDatabase() {
        return database;
    }
}

