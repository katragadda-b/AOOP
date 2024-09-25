
public class Bidder implements Observer{
	private String name;

    public Bidder(String name) {
        this.name = name;
    }
    public void update(float newBid) {
        System.out.println(name + ": The new highest bid is $" + newBid);
    }
}
