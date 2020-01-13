package model;

public class Bidder implements Observer {

    private String name;
    private double personalBid;
    private double currentBid;
    private double maxBid;

    public Bidder(String name, double maxBid) {
        this.name = name;
        this.maxBid = maxBid;
    }

    //getters
    public String getName() {
        return name;
    }

    public Double getPersonalBid() {
        return personalBid;
    }

    public Double getCurrentBid() {
        return currentBid;
    }

    public Double getMaxBid() {
        return maxBid;
    }

    @Override
    public void update(Subject auctioneer, Object arg) {
        currentBid = (double) arg;
        System.out.println("Bidder " + name + " has been updated with the most recent high bid.");
        if ((double) arg < maxBid) {
            makeBid((double) arg);
        } else {
            System.out.println("I can't bid any higher!");
        }
    }

    public void makeBid(double currentBid) {
        
    }
}
