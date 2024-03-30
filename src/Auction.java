public interface Auction {
    void attach(Bidder bidder);
    void detach(Bidder bidder);
    void notifyBidders();
}
