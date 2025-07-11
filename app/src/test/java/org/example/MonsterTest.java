package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

//String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };

public class MonsterTest {
  @Test
  public void testMonsterCreation() {
    Monster monster = new Monster(0, 1);
    assertEquals("スライム:レア度[1]", monster.toString());
  }

  @Test
  public void testSummonMonster() {
    Monster monster = new Monster(1, 2);
    String summoned = monster.summonMonster(3);
    assertEquals("デュラハン", summoned);
  }

  @Test
  public void testEvolve() {
    Monster monster = new Monster(2, 3);
    monster.evolve();
    assertEquals("ドラゴンナイト:レア度[3]", monster.toString());
  }
}
