
public interface PhoneSubject {
    public void attach(PhoneObserver observer);

    public void detach(PhoneObserver observer);

    public void simulateKeyPresses(int numKeyPresses);

    public void updateObserver();

    public void notifyObservers();
}
