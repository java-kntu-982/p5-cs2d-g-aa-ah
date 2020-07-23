package ir.ac.kntu.gamelogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GunTest {

    private Player player = new CTPlayer(50,100);
    private MainGun gun0 = new M4A1();
    private Colt gun1 = new P2000();

    @Test
    void buyGun() {

        assertFalse(player.buyMainGun(gun0));
        player.setMoney(player.getMoney() + gun0.getPrice());
        assertTrue(player.buyMainGun(gun0));
        assertEquals(player.getMoney(), 800);

        assertTrue(player.buyColt(gun1));
        player.setMoney(player.getMoney() + gun1.getPrice());
        assertTrue(player.buyColt(gun1));

    }
}