package com.ashu.COLLECTION.Challange;

import com.ashu.POLY.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Card> deck =Card.getStandardDeck();
        Card.printDeck(deck);
    }
}
