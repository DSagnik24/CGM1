package M1Question;

import java.util.List;

public class AnalyticsStoreImpl implements IanalyticsStore {

    @Override
    public void storeActions(List<ActionEnum> actions) {

        System.out.println("Stored batch: " + actions);

    }
}
