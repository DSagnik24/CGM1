package API_RequestBatchingSystem;

import java.util.*;

interface IApiRequestTracker {

    void registerRequest(RequestType request);

    int getPendingRequests();

    int getTotalRequests();

    List<RequestType> getMostFrequentRequests();
}

