
public class FactoryDemoPattern {
    public static void main(String[] args) {
        ShoeFactory shoefactory=new ShoeFactory();
        Shoe myshoe=shoefactory.getShoe("Middle price");
        myshoe.showspec();
    }
}
