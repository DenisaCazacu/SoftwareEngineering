import java.util.List;

public class Wishlist {
    float moneyGifted;
    final String id;
    //Event event;
    List<Gift> gifts;

    public Wishlist(String id) {
        this.id = id;
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public void removeGift(Gift gift) {
        gifts.remove(gift);
    }

    public void addMoneyGift(float amount) {
        moneyGifted += amount;
    }

    public float getMoneyGifted() {
        return moneyGifted;
    }
}
