
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform "web search" (from a file), notify the interested observers of each
 * query.
 */
public class WebSearchModel {

    public interface QueryObserver {
        void onQuery(String query);
    }

    public interface WebSearchFilterStrategy {
        public boolean filter(String query);
    }

    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();
    private final List<WebSearchFilterStrategy> filters = new ArrayList<>();

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addQueryObserver(QueryObserver queryObserver, WebSearchFilterStrategy webSearchStrategy) {
        observers.add(queryObserver);
        filters.add(webSearchStrategy);
    }

    private void notifyAllObservers(String line) {
        for (int i = 0; i < filters.size(); i++) {
            if (filters.get(i).filter(line))
                observers.get(i).onQuery(line);
        }
    }
}
