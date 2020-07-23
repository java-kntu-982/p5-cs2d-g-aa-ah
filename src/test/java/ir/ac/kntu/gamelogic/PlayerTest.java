package ir.ac.kntu.gamelogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player CTPlayer = new CTPlayer(50,67);
    Player TPlayer = new TPlayer(45,63);
    MainGun mainGun = new Famas();
    MainGun mainGun0 = new Galil();

    @Test
    void setGunAtFirst() {
        assertEquals( "USP",CTPlayer.getColt().getClass().getSimpleName());
        assertEquals( "Glock",TPlayer.getColt().getClass().getSimpleName());
    }

    @Test
    void fireEnemy() {
        //TODO
    }

    @Test
    void buyMainGun() {
        CTPlayer.setMoney(1000000);
        assertEquals(true, CTPlayer.buyMainGun(mainGun));
        assertEquals("Famas", CTPlayer.getMainGun().getClass().getSimpleName());

        TPlayer.setMoney(1000000);
        assertEquals(true, TPlayer.buyMainGun(mainGun0));
        assertEquals("Galil", TPlayer.getMainGun().getClass().getSimpleName());

    }
}