package com.solid.principle.Lesson4_liskov_substitution_principle.ProblematicCode;

public class RupayCard extends CreditCard {

    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay implementation of visa");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online transfer implementation of visa");

    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and pay implementation of visa");

    }

    @Override
    public void mandatePayment() {
        System.out.println("Mandate payment implementation of visa");
    }

    @Override
    public void upiPayment() {
        System.out.println("Upi payment of rupay");
    }

    @Override
    public void internationalPayment() {

    }
}
