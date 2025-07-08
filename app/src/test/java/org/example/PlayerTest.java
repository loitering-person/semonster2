package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  @Test
  public void testdrawMonsters() {
    Player player = new Player("test");

    assertEquals(8, player.deck.size());
  }

  @Test
  public void testtoString() {
    Player player = new Player("test");

    assertNotNull("Check Deck", player.toString());
  }
}
