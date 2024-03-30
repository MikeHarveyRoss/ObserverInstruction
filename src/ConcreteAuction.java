import java.util.ArrayList;
import java.util.List;

public class ConcreteAuction implements Auction{
    private List<Bidder> bidders = new ArrayList<>();
    private double currentBidPrice;

    @Override
    public void attach(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void detach(Bidder bidder) {
        bidders.remove(bidder);
    }

    public void setNewBidPrice(double bid) {
        this.currentBidPrice = bid;
        notifyBidders();
    }

    @Override
    public void notifyBidders() {
        for (Bidder bidder : bidders) {
            bidder.updateBid(this.currentBidPrice);
        }
    }
}
