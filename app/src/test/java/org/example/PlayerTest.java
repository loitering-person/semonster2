package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedList;

//String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };

public class PlayerTest {
  int[] generatedDeckArr = { 3, 0, 2, 4, 3, 0, 3, 3, 0, 1 };

  // テストのやり方：generatedDeckArrの内容を編集し、以下の関数でそれをlinked list（generated deck)にコピー
  // 得られたlinked listは、playerインスタンスのコンストラクタで使う
  public LinkedList<Integer> insertArrToLL() {
    LinkedList<Integer> outputLL = new LinkedList<>();
    for (int i : this.generatedDeckArr) {
      outputLL.add(i);
    }
    return outputLL;
  }

  @Test
  public void testdrawMonsters() {
    LinkedList<Integer> generatedDeck = new LinkedList<Integer>();
    generatedDeck = insertArrToLL();
    Player player = new Player("test", generatedDeck);

    assertEquals(this.generatedDeckArr.length / 2, player.deck.size());
  }

  @Test
  public void testtoString() {
    LinkedList<Integer> generatedDeck = new LinkedList<Integer>();
    generatedDeck = insertArrToLL();
    Player player = new Player("test", generatedDeck);
    String cmpString = "Deck:user\n";

    for (int i = 0; i < generatedDeckArr.length; i += 2) {
      cmpString += new Monster(generatedDeckArr[i], generatedDeckArr[i + 1]).toString() + '\n';
    }

    assertEquals(player.toString(), cmpString);
  }
}
