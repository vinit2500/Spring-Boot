package com.solid.principle.Lesson4_liskov_substitution_principle.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

/*
  LSP says that inheritance might not be the best way always for reusability.
  Do inheritance if there is a strict is a relationship.
      OR
  LSP says that subtypes must be substitutable for base type.
      OR
  Objects of a child class should be as it is substitutable in variable of parent class.
  -> No change should be required in the codebase to accomodate a specific child class or you
  can say child classes should not need special treatment.
  -> child class do exactly what the parent class expects.
*/

public class Main {

    public static void main(String[] args) {
        List<CreditCard> cards = new ArrayList<>();

        for(CreditCard card : cards) {
            if (card instanceof RupayCard) {
                card.upiPayment();
            }
        }
    }
}
