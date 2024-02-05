package ATM.System;

public class Card {
    private long cardNumber;
    private String expirationDate;
    private String pin;

    public Card(long cardNumber, String expirationDate, String pin) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.pin = pin;
    }
    public boolean validatePin(String enteredPin) {
        return enteredPin.equals(pin);
    }
    
}
