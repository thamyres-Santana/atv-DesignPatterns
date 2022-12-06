
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Mimic the data input ability of a physical phone's keypad;
 * however, here we're just sending it fake digits.
 */
public class KeyPad implements PhoneSubject {
    private final PhoneModel model;
    private final List<PhoneObserver> observers;

    public KeyPad(PhoneModel model) {
        this.model = model;
        this.observers = new ArrayList<>();
    }

    public void addObserver(PhoneObserver observer) {
        observers.add(observer);
    }

    @Override
    public void simulateKeyPresses(int numKeyPresses) {
        final int MAX_DIGIT = 12;
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) {
            int newDigit = rnd.nextInt(MAX_DIGIT);
            System.out.println("Pressing: " + newDigit);
            model.addDigit(newDigit);
            updateObserver();
        }
        notifyObservers();
    }

    @Override
    public void attach(PhoneObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(PhoneObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (PhoneObserver observer : observers) {
            observer.printAllNumbersCall();
        }
    }

    @Override
    public void updateObserver() {
        for (PhoneObserver observer : observers) {
            observer.printRecentNumber();
        }
    }
}
