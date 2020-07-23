package ir.ac.kntu.gamelogic;

public class CTPlayer extends Player{

    public CTPlayer(int x, int y) {
        super(x, y);
    }

    @Override
    public void setGunAtFirst() {
        setColt(new USP());
    }

    public boolean defuseBomb(Bomb bomb) {
        if (getX() == bomb.getX() && getY()==bomb.getY()) {
            bomb.setDef(true);
            return true;
        } else {
            return false;
        }
    }
}
