package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  ArrayList<Monster> deck = new ArrayList<>();
  LinkedList<Integer> randomlyGeneratedDeck;
  String name;
  private int maxRarity = 4;
  private int monstersPerDeck = 8;
  private int numberOfMonsterNames = 5;

  Player(String name) {
    this.name = name;
    this.drawMonsters();
  }

  public void drawMonsters() {
    Random r = new Random();
    int nameNum, rarityNum;
    String monsterName;
    for (int i = 0; i < monstersPerDeck; i++) {

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
