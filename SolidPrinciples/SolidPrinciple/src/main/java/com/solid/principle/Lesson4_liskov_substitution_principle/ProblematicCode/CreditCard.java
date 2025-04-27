package com.solid.principle.Lesson4_liskov_substitution_principle.ProblematicCode;

public abstract class CreditCard {

    private String ccNumber;

    private String ownerName;

    private int cvv;

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public abstract void tapAndPay();

    public abstract void onlineTransfer();

    public abstract void swipeAndPay();

    public abstract void mandatePayment();

    public abstract void upiPayment();

    public abstract void internationalPayment();

    public void displayCreditCardDetails() {
        System.out.println("CC Number: "+ this.ccNumber + " , with owner Name: "+ this.ownerName);
    }
}
