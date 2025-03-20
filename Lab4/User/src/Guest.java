import java.util.List;
import java.util.UUID;

public class Guest extends User {

    public Guest(UUID id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public StringBuilder viewWishlist(Wishlist wishlist) {
        StringBuilder whishlistView = new StringBuilder();

        List<Gift> gifts = wishlist.gifts;

        for (Gift gift : gifts) {
            whishlistView.append(gift.name).append('\n');
        }

        return whishlistView;
    }

    public boolean ContributeToGift(Gift gift, float amount) {
        return gift.addContribution(amount);
    }

    public void leaveCashGift(float amount, Wishlist wishlist) {
        wishlist.addMoneyGift(amount);
    }
}
