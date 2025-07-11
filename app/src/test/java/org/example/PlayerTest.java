package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedList;

//String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };

public class PlayerTest {
  int[] generatedDeckArr = { 3, 0, 2, 4, 3, 0, 3, 3, 0, 1 };
  final int MAX_DECK_SIZE = 8;

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
  public void testConstructor() {
    Player player = new Player("test", insertArrToLL());
    int expectedDeckSize = Math.min(generatedDeckArr.length / 2, MAX_DECK_SIZE);

    assertEquals("名前が正しく設定されているか", "test", player.getName());
    assertEquals("初期HPが100か", 100, player.getHp());
    assertEquals("デッキサイズが正しいか", expectedDeckSize, player.getDeck().size());
  }

  @Test
  public void testSetName() {
    Player player = new Player("test", insertArrToLL());
    player.setName("newName");
    assertEquals("newName", player.getName());
  }

  @Test
  public void testSetHp() {
    Player player = new Player("test", insertArrToLL());
    player.setHp(80);
    assertEquals("HPを正しくセットできるか", 80, player.getHp());

    player.setHp(-10);
    assertEquals("HPは負にならないか", 0, player.getHp());
  }

  @Test
  public void testTakeDamage() {
    Player player = new Player("test", insertArrToLL());
    int initialHp = player.getHp();

    player.takeDamage(20);
    assertEquals("HPは正しく減るか", initialHp - 20, player.getHp());

    player.takeDamage(initialHp);
    assertEquals("HPは負にならないか", 0, player.getHp());
  }

  @Test
  public void testToString() {
    Player player = new Player("test", insertArrToLL());
    String result = player.toString();
    String nameString = "Deck: " + player.getName();
    String hpString = "HP: " + player.getHp();
    String monsterString = "";

    for (int i = 0; i < generatedDeckArr.length - 1; i += 2) {
      monsterString += new Monster(generatedDeckArr[i], generatedDeckArr[i + 1]).toString() + '\n';
    }
    assertTrue("名前が表示に含まれる", result.contains(nameString));
    assertTrue("HPが表示に含まれる", result.contains(hpString));
    assertTrue("モンスターが表示に含まれる", result.contains(monsterString));
  }
}
