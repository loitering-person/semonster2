package org.example;

public class Monster {
  String name;
  int rare;

  Monster(String name, int rare) {
    this.name = name;
    this.rare = rare;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
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
