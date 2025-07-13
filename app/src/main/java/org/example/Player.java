package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

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
  private LinkedList<Integer> randomlyGeneratedDeck;
  private String name;

  public Player(String name, LinkedList<Integer> deckLL) {
    this.hp = DEFAULT_HP;
    this.name = name;
    this.randomlyGeneratedDeck = deckLL;
    this.deck = this.drawMonsters();
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    this.hp = Math.max(0, hp); // HPは0未満にならないようにする
  }

  public void takeDamage(int damage) {
    this.hp = Math.max(0, this.hp - damage);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Monster> getDeck() {
    return this.deck;
  }

  public ArrayList<Monster> drawMonsters() {
    ArrayList<Monster> newDeck = new ArrayList<Monster>();
    while (!randomlyGeneratedDeck.isEmpty() && newDeck.size() < MAX_DECK_SIZE) {
      int monsterId = this.randomlyGeneratedDeck.pop();
      int monsterRare = this.randomlyGeneratedDeck.pop();
      newDeck.add(new Monster(monsterId, monsterRare));
    }
    return newDeck;
  }

  public void showDeck() {
    for (Monster m : this.deck) {
      System.out.println(m);
    }
  }

  @Override
  public String toString() {
    String message = "";
    message += "Deck: " + this.name + "\n";
    message += "HP: " + this.hp + "\n";
    for (Monster m : this.deck) {
      message += m + "\n";
    }
    return message;
  }

  public void attack(Player target, int monsterIndex) {
    if (monsterIndex < 0 || this.deck.size() <= monsterIndex) {
      System.out.println("不正なモンスターのインデックスです");
      return;
    }

    Monster attacker = this.deck.get(monsterIndex);
    int damage = attacker.getAttack();

    System.out.println(this.name + "の" + attacker.getName() + "が" + target.getName() + "を攻撃! " + damage + "のダメージ!");

    target.takeDamage(damage);
  }

}
