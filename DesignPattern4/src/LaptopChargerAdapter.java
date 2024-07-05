public class LaptopChargerAdapter implements Charger{
    private LaptopCharger laptopCharger;
    public  LaptopChargerAdapter(LaptopCharger laptopCharger){

        this.laptopCharger=laptopCharger;
    }
    @Override
    public void charge(){
        laptopCharger.chargeLaptop();
    }
}
