package ir.ac.kntu.gamelogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BombTest {
    Bomb testBomb = new Bomb(10,15);

    @Test
    void plant() {

        assertTrue(testBomb.plant(1, 1));
        assertEquals(1, testBomb.getX());
        assertFalse(testBomb.getY() == 2);
        assertFalse(testBomb.plant(-1, -1));

    }
}