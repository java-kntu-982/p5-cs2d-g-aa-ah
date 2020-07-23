package ir.ac.kntu.gamelogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShieldTest {

    private Player player = new CTPlayer(14,22);

    @Test
    void increase() {
        assertEquals(100, player.getHealth());

        player.setShield();
        assertEquals(180, player.getHealth());
    }
}