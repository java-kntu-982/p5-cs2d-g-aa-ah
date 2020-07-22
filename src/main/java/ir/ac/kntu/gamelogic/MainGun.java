package ir.ac.kntu.gamelogic;

public abstract class MainGun extends Gun{

    public MainGun(int price, int damage, int millisToFireAgain, double secondsToReload, int magazineCapacity, boolean isRifle) {
        super(price, damage, millisToFireAgain, secondsToReload, magazineCapacity, isRifle);
    }
}
