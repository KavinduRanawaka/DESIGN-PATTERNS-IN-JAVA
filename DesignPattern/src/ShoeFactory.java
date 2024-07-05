public class ShoeFactory {
    public Shoe getShoe(String shapetype){
        if(shapetype==null){
            return null;
        }
        if(shapetype.equalsIgnoreCase("Low price")){
            return new Adidas();
        }
        else if(shapetype.equalsIgnoreCase("middle price")){
            return new Puma();
        }
        else if(shapetype.equalsIgnoreCase("Expensive")){
            return new Nike();
        }
        return null;
    }
}
