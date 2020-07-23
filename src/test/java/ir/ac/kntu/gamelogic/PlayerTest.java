package ir.ac.kntu.gamelogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player cTPlayer = new CTPlayer(50,67);
    private Player tPlayer = new TPlayer(45,63);
    private MainGun mainGun = new Famas();
    private MainGun mainGun0 = new Galil();

    @Test
    void setGunAtFirst() {
        assertEquals( "USP",cTPlayer.getColt().getClass().getSimpleName());
        assertEquals( "Glock",tPlayer.getColt().getClass().getSimpleName());
    }

    @Test
    void fireEnemy() {
        //TODO
    }

    @Test
    void buyMainGun() {
        cTPlayer.setMoney(1000000);
        assertTrue(cTPlayer.buyMainGun(mainGun));
        assertEquals("Famas", cTPlayer.getMainGun().getClass().getSimpleName());

        tPlayer.setMoney(1000000);
        assertTrue(tPlayer.buyMainGun(mainGun0));
        assertEquals("Galil", tPlayer.getMainGun().getClass().getSimpleName());

    }
}