package ir.ac.kntu.gamelogic;

public class Shield {

    private int price;
    private int increasesHP;

    public void increase (Object o) {
//      o. +=increasesHP;
    }

    public Shield () {
        this.price = 1000;
        this.increasesHP = 80;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
