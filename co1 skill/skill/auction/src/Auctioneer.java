import java.util.ArrayList;
import java.util.List;

public class Auctioneer {
	private List<Observer> bidders = new ArrayList<>();
    private float highestBid = 0;
    public void registerBidder(Observer bidder) {
        bidders.add(bidder);
    }
    public void removeBidder(Observer bidder) {
        bidders.remove(bidder);
    }
    public void notifyBidders() {
        for (Observer bidder : bidders) {
            bidder.update(highestBid);
        }
    }
    public void setNewBid(float bid) {
        if (bid > highestBid) {
            this.highestBid = bid;
            System.out.println("Auctioneer: New highest bid is $" + highestBid);
            notifyBidders();
        } else {
            System.out.println("Auctioneer: Bid of $" + bid + " is lower than the current highest bid.");
        }
    }

    public float getHighestBid() {
        return highestBid;
    }
}
