package ir.ac.kntu.gamelogic;

public class TPlayer extends Player {

    private Bomb bomb;

    public TPlayer(int x, int y) {
        super(x, y);
        this.bomb = null;
    }

    @Override
    public void setGunAtFirst() {
        setColt(new Glock());
    }

    public Bomb getBomb() {
        return bomb;
    }

    public void setBomb(Bomb bomb) {
        this.bomb = bomb;
    }
}