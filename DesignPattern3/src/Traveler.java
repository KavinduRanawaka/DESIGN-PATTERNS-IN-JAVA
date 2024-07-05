public class Traveler {
    private TravelStrategy strategy;

    public void setStrategy(TravelStrategy strategy){

        this.strategy=strategy;
    }
    public void travel(String destination){

        strategy.travel(destination);
    }
}
