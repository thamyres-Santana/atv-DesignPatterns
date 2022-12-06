
import java.io.File;

/**
 * Launch the web-search example
 */
public class Main {
    public static void main(String[] args) {
        // Source file (in the project's data/ folder)
        File inputTextFile = new File("C:\\Users\\20192ewbj0280\\Hamlet.txt");

        // Build object graph
        WebSearchModel model = new WebSearchModel(inputTextFile);
        Snooper snoop = new Snooper(model);

        // Execute
        model.pretendToSearch();
    }
}
