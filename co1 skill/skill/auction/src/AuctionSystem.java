
public class AuctionSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Auctioneer auctioneer = new Auctioneer();       
        Bidder bidder1 = new Bidder("Bidder 1");
        Bidder bidder2 = new Bidder("Bidder 2");
        auctioneer.registerBidder(bidder1);
        auctioneer.registerBidder(bidder2);
        Auction englishAuction = new EnglishAuction(auctioneer, 100);
        englishAuction.startAuction();
	}
}