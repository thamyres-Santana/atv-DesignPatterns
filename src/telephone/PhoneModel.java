
import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public Integer getLastNumber() {
        return digits.get(digits.size() - 1);
    }

    @Override
    public String toString() {
        return "Agora discando " + this.getDigitsToString();
    }

    private String getDigitsToString() {
        String digitsString = "";
        for (Integer digit : digits) {
            digitsString += digit;
        }
        return digitsString;
    }
}
