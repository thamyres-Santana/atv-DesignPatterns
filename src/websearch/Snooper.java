
/**
 * Watches the search queries
 */
public class Snooper {
    public Snooper(WebSearchModel model) {
        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Son long... " + query);
            }
        },
                new WebSearchModel.WebSearchFilterStrategy() {
                    @Override
                    public boolean filter(String query) {
                        return query.length() > 60;
                    }
                });

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Oh Yes! " + query);
            }
        },
                new WebSearchModel.WebSearchFilterStrategy() {
                    @Override
                    public boolean filter(String query) {
                        return query.toLowerCase().contains("friend");
                    }
                });
    }
}
