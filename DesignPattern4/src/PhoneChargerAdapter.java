public class PhoneChargerAdapter implements Charger{
    private PhoneCharger phoneCharger;
    public  PhoneChargerAdapter(PhoneCharger phoneCharger){
        this.phoneCharger=phoneCharger;
    }
    @Override
    public void charge(){
        phoneCharger.chargePhone();
    }
}
