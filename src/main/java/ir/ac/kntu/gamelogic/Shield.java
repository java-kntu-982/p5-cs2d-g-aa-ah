package ir.ac.kntu.gamelogic;

public class Shield {

    private int price;

    public void increase (Player o) {
        o.setHealth(o.getHealth()+80);
    }

    public Shield () {
        this.price = 1000;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
