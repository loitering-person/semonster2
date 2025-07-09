package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  ArrayList<Monster> deck = new ArrayList<>();
  LinkedList<Integer> randomlyGeneratedDeck;
  String name;

  Player(String name, LinkedList<Integer> deckLL) {
    this.name = name;
    this.randomlyGeneratedDeck = deckLL;
    this.deck = this.drawMonsters();
  }

  public ArrayList<Monster> drawMonsters() {
    ArrayList<Monster> newDeck = new ArrayList<Monster>();
    while (!randomlyGeneratedDeck.isEmpty()) {
      newDeck.add(new Monster(this.randomlyGeneratedDeck.pop(), this.randomlyGeneratedDeck.pop()));
    }
    return newDeck;
  }

  public void showDeck() {
    for (Monster m : this.deck) {
      System.out.println(m);
    }
  }

  public String toString() {
    String message = "";

    message += "Deck:user\n";

    for (Monster m : this.deck) {
      message += m + "\n";
    }

    return message;
  }

}
