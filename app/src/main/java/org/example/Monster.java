package org.example;

public class Monster {
  String name;
  int rare;
  int hp;

  Monster(int nameNum, int rare, int hp) {
    this.name = this.summonMonster(nameNum);
    this.rare = rare;
    this.hp = hp;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]" + "', hp=" + hp;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  void evolve() {
    if (this.rare >= 3) {
      this.name = this.name + "ナイト";
    }
  }
}
