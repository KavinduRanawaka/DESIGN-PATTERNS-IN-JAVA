public class StrategyPatternDemo {
    public static void main(String[] args) {
        Traveler traveler=new Traveler();

        //travel by car
        traveler.setStrategy(new CarTravelStrategy());
        traveler.travel("Colombo");

        //travel by bicycle
        traveler.setStrategy(new BicycleTravelStrategy());
        traveler.travel("Pabahinna");

    }
}
