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
  String name;

  Player(String name) {
    this.name = name;
    this.drawMonsters();
  }

  public void drawMonsters() {
    for (int i = 0; i < 8; i++) {
      this.deck.add(new Monster("スライム", 2));
    }
  }

  public void drawMonsters(LinkedList<Monster> monsters) {
    for (Monster monster : monsters) {
      this.deck.add(monster);
    }

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
