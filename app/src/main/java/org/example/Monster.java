package org.example;

public class Monster {
  String name;
  int rare;

  private int attack;
  private int defense;

  Monster(int nameNum, int rare) {
    this.name = this.summonMonster(nameNum);
    this.rare = rare;

    this.attack = rare * 10;
    this.defense = rare * 5;
  }

  public int getAttack() {
    return this.attack;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "], 攻/防[" + this.attack + "/" + this.defense + "]";
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  void evolve() {
    if (this.rare >= 3) {
      this.name = this.name + "ナイト";
      this.attack += 20;
      this.defense += 10;
      this.rare += 2;
    }
  }
}
