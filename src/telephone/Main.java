public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Build the object graph
        PhoneModel model = new PhoneModel();
        PhoneObserver screen = new Screen(model);
        PhoneSubject keyPad = new KeyPad(model);

        // Add observers
        keyPad.attach(screen);

        // Run the program
        keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}
