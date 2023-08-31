package CreationalDP.AbstractFactoryDP;

public class FactoryProducer {
    public static AbstractFactory getFactory(String select){
        if(select.equalsIgnoreCase("şekil")){
            return new ShapeFactory();
        }else if(select.equalsIgnoreCase("renk")){
            return new ColorFactory();
        }
        return null;
    }
}
