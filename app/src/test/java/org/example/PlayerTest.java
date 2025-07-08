package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  @Test
  public void testConstructor() {
    Player player = new Player();

    assertEquals(100, player.getHp());
    assertEquals(8, player.getDeck().size());
  }

  @Test
  public void testTakeDamage() {
    Player player = new Player();
    int initialHp = player.getHp();

    player.takeDamage(20);
    assertEquals(initialHp - 20, player.getHp());

    player.takeDamage(initialHp); // HPが0未満にならないことを確認
    assertEquals(0, player.getHp());
  }

  @Test
  public void testDrawMonsters() {
    Player player = new Player();

    player.drawMonsters();
    assertEquals(8, player.getDeck().size());
  }

  @Test
  public void testToString() {
    Player player = new Player();
    String result = player.toString();
    String hpString = "HP: " + player.getHp();

    assertNotNull("toString()はnullでない", result);
    assertTrue("HPが表示に含まれる", result.contains(hpString));
  }

}
