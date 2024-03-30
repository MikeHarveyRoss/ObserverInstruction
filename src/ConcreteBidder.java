public class ConcreteBidder implements Bidder{
    private String name;

    public ConcreteBidder(String name) {
        this.name = name;
    }

    @Override
    public void updateBid(double amount) {
        System.out.println(name + " has been notified about the new bid: " + amount);
    }
}
