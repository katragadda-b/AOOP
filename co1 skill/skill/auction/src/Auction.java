public abstract class Auction {
	protected Auctioneer auctioneer;

    public Auction(Auctioneer auctioneer) {
        this.auctioneer = auctioneer;
    }
    public final void startAuction() {
        startBidding();
        while (!isAuctionOver()) {
            placeBid();
        }
        declareWinner();
    }
    protected abstract void startBidding();
    protected abstract boolean isAuctionOver();
    protected abstract void placeBid();
    protected abstract void declareWinner();

}
