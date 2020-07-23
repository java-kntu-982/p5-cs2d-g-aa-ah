package ir.ac.kntu.gamelogic;

public class Bomb {
    private int x;
    private int y;
    private boolean isPlant;
    private boolean isDef;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean plant(int x,int y){// it depends on our map
        if (x>0 && y>0) {//TODO
            isPlant = true;
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }


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

    public boolean isPlant() {
        return isPlant;
    }

    public void setPlant(boolean plant) {
        isPlant = plant;
    }

    public boolean isDef() {
        return isDef;
    }

    public void setDef(boolean def) {
        isDef = def;
    }
}
