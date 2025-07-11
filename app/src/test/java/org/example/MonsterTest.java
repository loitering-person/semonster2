package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

//String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };

public class MonsterTest {
  @Test
  public void testMonsterCreation() {
    Monster monster = new Monster(0, 1, 10);
    assertEquals("スライム:レア度[1]', hp=10", monster.toString());
  }

  @Test
  public void testSummonMonster() {
    Monster monster = new Monster(1, 2, 40);
    String summoned = monster.summonMonster(3);
    assertEquals("デュラハン", summoned);
  }

  @Test
  public void testEvolve() {
    Monster monster = new Monster(2, 3, 20);
    monster.evolve();
    assertEquals("ドラゴンナイト:レア度[3]', hp=20", monster.toString());
  }
}
