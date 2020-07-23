package ir.ac.kntu.gamelogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BombTest {
    Bomb testBomb = new Bomb(10,15);

    @Test
    void plant() {

        assertEquals(true, testBomb.plant(1,1));
        assertEquals(1, testBomb.getX());
        assertEquals(false, testBomb.getY()==2);
        assertEquals(false, testBomb.plant(-1,-1));

    }
}