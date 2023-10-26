package week04.Lecture;

import java.util.Date;

public class CredditCard {
    private int cardNumber;
    private Date issueDate;
    private double balance;
    private String cvc;
    private CardType cardType;
    private CardIssuer cardIssuer;

    public CredditCard(int cardNumber, Date issueDate, double balance, String cvc, CardType cardType, CardIssuer cardIssuer) {
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.balance = balance;
        this.cvc = cvc;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
    }

    public CredditCard(double balance) {
        this.balance = balance;
        // MOZEMO DODATI I DEFAULT VALUES
        this.cardNumber = 01234232421;
        this.cardIssuer = CardIssuer.MASTERCARD;
    }

    public void printCardIssuer() {
        System.out.println(this.cardIssuer);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardIssuer getCardIssuer() {
        return cardIssuer;
    }

    public void setCardIssuer(CardIssuer cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    public String toString() {
        return "Card number: ".concat(String.valueOf(this.cardNumber))
                .concat(", and the balance is: ")
                .concat(String.valueOf(this.balance));
    }
}
