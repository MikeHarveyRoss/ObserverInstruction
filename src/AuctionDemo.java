public class AuctionDemo {
    public static void main(String[] args) {
        ConcreteAuction auction = new ConcreteAuction();

        Bidder bidder1 = new ConcreteBidder("Bidder1");
        Bidder bidder2 = new ConcreteBidder("Bidder2");
        Bidder bidder3 = new ConcreteBidder("Bidder3");

        auction.attach(bidder1);
        auction.attach(bidder2);
        auction.attach(bidder3);

        auction.setNewBidPrice(100.0); //Set new price
        auction.detach(bidder2); // Bidder2 exits
        auction.setNewBidPrice(150.0); // set a new price, and others will be notified



    }
}
