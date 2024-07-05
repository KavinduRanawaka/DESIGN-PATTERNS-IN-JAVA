public class SigeltonDemo {
    public static void main(String[] args) {
//        Car obj=new Car(); this will be error
          Car obj=Car.getVehicle();
          obj.showMessage();
    }
}
