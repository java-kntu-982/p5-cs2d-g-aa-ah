package ir.ac.kntu.gamelogic;

public abstract class Player {
    private int money;
    private Colt colt;
    private MainGun mainGun;
    private Shield shield;
    private int health;
    private boolean isCTPlayer;

    public Player(boolean isCTPlayer) {
        this.money = 800;
        this.mainGun = null;
        this.shield = null;
        this.health = 100;
        this.isCTPlayer = isCTPlayer;
        if (isCTPlayer) {
            this.colt = new Glock();
        } else {
            this.colt = new USP();
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Colt getColt() {
        return colt;
    }

    public boolean buyColt(Colt colt) {
        if (colt.buyGun(this)){
            this.colt = colt;
            return true;
        }
        return false;
    }

    public MainGun getMainGun() {
        return mainGun;
    }

    public boolean buyMainGun(MainGun mainGun) {
        if (mainGun.buyGun(this)){
            this.mainGun = mainGun;
            return true;
        }
        return false;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield() {
        this.shield = new Shield();
        shield.increase(this);

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isCTPlayer() {
        return isCTPlayer;
    }

    public void setCTPlayer(boolean CTPlayer) {
        isCTPlayer = CTPlayer;
    }
}