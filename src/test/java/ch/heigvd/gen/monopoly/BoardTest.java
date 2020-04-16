package ch.heigvd.gen.monopoly;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BoardTest {
  @Test
  public void testGetSquareThrowsWhenUnderflow() {
    int index = -1;
    Board board = new Board();
    assertThrows(IndexOutOfBoundsException.class, () -> board.getSquare(index));
  }

  @Test
  public void testGetSquareThrowsWhenOverflow() {
    int index = 1000;
    Board board = new Board();
    assertThrows(IndexOutOfBoundsException.class, () -> board.getSquare(index));
  }
}