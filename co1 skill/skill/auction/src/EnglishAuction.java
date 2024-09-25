import java.util.Scanner;
public class EnglishAuction extends Auction{
	 private float reservePrice;
	    private Scanner scanner;

	    public EnglishAuction(Auctioneer auctioneer, float reservePrice) {
	        super(auctioneer);
	        this.reservePrice = reservePrice;
	        this.scanner = new Scanner(System.in);
	    }
	    protected void startBidding() {
	        System.out.println("Starting an English Auction. Reserve price: $" + reservePrice);
	    }
	    protected boolean isAuctionOver() {
	        return auctioneer.getHighestBid() >= reservePrice;
	    }
	    protected void placeBid() {
	        System.out.print("Enter a new bid: ");
	        float bid = scanner.nextFloat();
	        auctioneer.setNewBid(bid);
	    }
	    protected void declareWinner() {
	        System.out.println("Auction Over! Winning bid: $" + auctioneer.getHighestBid());
	    }
}
