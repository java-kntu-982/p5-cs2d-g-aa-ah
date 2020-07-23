package ir.ac.kntu.gamelogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BombTest {
    private Bomb testBomb = new Bomb(10,15);

    @Test
    void plant() {

        assertTrue(testBomb.plant(1, 1));
        assertEquals(1, testBomb.getX());
        assertNotEquals(2, testBomb.getY());
        assertFalse(testBomb.plant(-1, -1));

    }
}