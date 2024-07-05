public class CarTravelStrategy implements TravelStrategy {
    @Override
    public  void travel(String destination){
        System.out.println("Travelling to "+destination+" by car");
    }
}
