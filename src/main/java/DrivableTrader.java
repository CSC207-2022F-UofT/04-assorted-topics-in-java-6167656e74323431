import java.util.List;

public class DrivableTrader extends Trader<Drivable> {
    /**
     * Construct a DrivableTrader, giving them the given inventory,
     * wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    /**
     * Construct a Trader given money, and assuming an empty inventory and wishlist.
     *
     * @param money The Trader's money
     */
    public DrivableTrader(int money) {
        super(money);
    }

    /**
     * Gets the price of item if it's tradable.
     *
     * @param item the item whose price to query.
     *
     * @return the item's price or Tradable.MISSING_PRICE if it's not tradeable.
     */
    @Override
    public int getSellingPrice(Drivable item) {
        int super_price = super.getSellingPrice(item);

        if (super_price == Tradable.MISSING_PRICE) {
            return super_price;
        }

        return super_price + item.getMaxSpeed();
    }
}