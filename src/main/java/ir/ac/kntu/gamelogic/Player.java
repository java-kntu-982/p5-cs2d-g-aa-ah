package ir.ac.kntu.gamelogic;

public abstract class Player {
    private int x;
    private int y;
    private int money;
    private Colt colt;
    private MainGun mainGun;
    private Shield shield;
    private int health;

    public void setColt(Colt colt) {
        this.colt = colt;
    }

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.money = 800;
        this.mainGun = null;
        this.shield = null;
        this.health = 100;
        setGunAtFirst();
    }

    public boolean fireEnemy(Player[] enemies, int[] xOfTarget, int[] yOfTarget) {

        for (int i = 0; i < enemies.length; i++) {
            /// This condition depends on our gamePlay map /// :)
            if ((enemies[i].getX() == xOfTarget[i]) && (enemies[i].getY() == yOfTarget[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean buyMainGun(MainGun mainGun) {
        if (mainGun.buyGun(this)){
            this.mainGun = mainGun;
            return true;
        }
        return false;
    }

    public abstract void setGunAtFirst();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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


}