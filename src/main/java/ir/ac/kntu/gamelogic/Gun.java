package ir.ac.kntu.gamelogic;

public abstract class Gun {
    private int price;
    private int damage;
    private int millisToFireAgain;
    private double secondsToReload;
    private int magazineCapacity;
    private int numOfAmmo;
    private boolean isRifle;

    public Gun(int price, int damage, int millisToFireAgain, double secondsToReload, int magazineCapacity, boolean isRifle) {
        this.price = price;
        this.damage = damage;
        this.millisToFireAgain = millisToFireAgain;
        this.secondsToReload = secondsToReload;
        this.magazineCapacity = magazineCapacity;
        this.isRifle = isRifle;
        numOfAmmo = magazineCapacity;
    }



    public boolean buyGun(Player p) {
        if (p.getMoney() >= this.price ){
            p.setMoney(p.getMoney()-price);
            return true;
        }
        return false;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMillisToFireAgain() {
        return millisToFireAgain;
    }

    public void setMillisToFireAgain(int millisToFireAgain) {
        this.millisToFireAgain = millisToFireAgain;
    }

    public double getSecondsToReload() {
        return secondsToReload;
    }

    public void setSecondsToReload(double secondsToReload) {
        this.secondsToReload = secondsToReload;
    }

    public int getMagazineCapacity() {
        return magazineCapacity;
    }

    public void setMagazineCapacity(int magazineCapacity) {
        this.magazineCapacity = magazineCapacity;
    }

    public boolean isRifle() {
        return isRifle;
    }

    public void setRifle(boolean rifle) {
        isRifle = rifle;
    }
}
