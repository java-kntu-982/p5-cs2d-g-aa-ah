package ir.ac.kntu.gamelogic;

public abstract class Colt extends Gun{

    public Colt(int price, int damage, int millisToFireAgain, double secondsToReload, int magazineCapacity) {
        super(price, damage, millisToFireAgain, secondsToReload, magazineCapacity, false);
    }
}
