import java.util.List;
import java.util.UUID;

public class Wishlist {
    float moneyGifted;
    final UUID id;
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
