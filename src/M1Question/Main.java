package M1Question;

public class Main {

    public static void main(String[] args) {

        IanalyticsStore store = new AnalyticsStoreImpl();

        analytics analyticsService = new analytics(store, 3);

        analyticsService.registerAction(ActionEnum.LOGIN);
        analyticsService.registerAction(ActionEnum.CLICK);
        analyticsService.registerAction(ActionEnum.LOGIN); // triggers batch

        analyticsService.registerAction(ActionEnum.PURCHASE);

        System.out.println(
                analyticsService.getNumberOfActionsRegisteredButNotSentToAnalyticsStore()
        );

        System.out.println(
                analyticsService.gettotalnumberofLoggedActions()
        );

        System.out.println(
                analyticsService.getMostFrequentlyUsedAction()
        );
    }
}
