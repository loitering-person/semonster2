package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedList;

//String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };

public class PlayerTest {
  int[] generatedDeckArr = { 3, 0, 2, 4, 3, 0, 3, 3, 0, 1 };

  // テストのやり方：generatedDeckArrの内容を編集し、以下の関数でそれをlinked list（generated deck)にコピー
  // 得られたlinked listは、playerインスタンスのコンストラクタで使う
  public LinkedList<Integer> insertArrToLL(LinkedList<Integer> inputLL) {
    LinkedList<Integer> outputLL = new LinkedList<>();
    for (int i : this.generatedDeckArr) {
      outputLL.add(i);
    }
    return outputLL;
  }

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
