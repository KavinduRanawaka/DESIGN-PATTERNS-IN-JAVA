public class Car {
    private Car(){}

    private static Car vehicle=new Car();

    public static Car getVehicle(){
        return vehicle;
    }
    public void showMessage(){
        System.out.println("Singelton pattern");
    }
}
