package org.example;

import java.util.ArrayList;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  private static final int MAX_DECK_SIZE = 8;
  private static final int DEFAULT_HP = 100;
  private ArrayList<Monster> deck = new ArrayList<>();
  private int hp;

  public Player() {
    this.hp = DEFAULT_HP;
    this.drawMonsters();
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public void takeDamage(int damage) {
    this.hp = Math.max(0, this.hp - damage);
  }

  public ArrayList<Monster> getDeck() {
    return this.deck;
  }

  public void drawMonsters() {
    while (this.deck.size() < MAX_DECK_SIZE) {
      this.deck.add(new Monster("スライム", 2));
    }
  }

  public void showDeck() {
    for (Monster m : this.deck) {
      System.out.println(m);
    }
  }

  @Override
  public String toString() {
    String message = "";
    message += "Deck:user\n";
    message += "HP: " + this.hp + "\n";
    for (Monster m : this.deck) {
      message += m + "\n";
    }
    return message;
  }

}
