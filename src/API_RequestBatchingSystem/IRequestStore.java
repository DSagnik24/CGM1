package API_RequestBatchingSystem;

import java.util.Queue;

interface IRequestStore {
    void storeRequests(Queue<RequestType> requests);
}
