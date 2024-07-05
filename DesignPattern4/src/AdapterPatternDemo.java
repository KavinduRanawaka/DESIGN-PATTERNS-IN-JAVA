public class AdapterPatternDemo {
    public static void main(String[] args) {
        PhoneCharger phoneCharger=new PhoneCharger();
        Charger phoneAdapter= new PhoneChargerAdapter(phoneCharger);
        phoneAdapter.charge();

        LaptopCharger laptopCharger=new LaptopCharger();
        Charger laptopAdapter=new LaptopChargerAdapter(laptopCharger);
        laptopAdapter.charge();
    }
}
