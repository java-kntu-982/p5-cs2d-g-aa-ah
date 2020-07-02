package ir.ac.kntu.gamelogic;

public abstract class Rifle extends Gun {

    private boolean isForCT;

    public Rifle(int price, int damage, int millisToFireAgain, double secondsToReload, int magazineCapacity, boolean isForCT) {
        super(price, damage, millisToFireAgain, secondsToReload, magazineCapacity, true);
        this.isForCT = isForCT;
    }

    public boolean isForCT() {
        return isForCT;
    }

    public void setForCT(boolean forCT) {
        isForCT = forCT;
    }
}
