package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedList;
//String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };

public class PlayerTest {
  @Test
  public void testdrawMonsters() {
    LinkedList<Integer> generatedDeck = new LinkedList<Integer>();

    Player player = new Player("test", generatedDeck);

    assertEquals(8, player.deck.size());
  }

  @Test
  public void testtoString() {
    LinkedList<Integer> generatedDeck = new LinkedList<Integer>();

    Player player = new Player("test", generatedDeck);

    assertNotNull("Check Deck", player.toString());
  }
}
