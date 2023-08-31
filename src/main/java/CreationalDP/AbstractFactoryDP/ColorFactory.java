package CreationalDP.AbstractFactoryDP;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color getObject(String objectType) {
        return getColor(objectType);
    }

    public Color getColor(String color){
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        }else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }else if(color.equalsIgnoreCase("Green")){
            return new Green();
        }
        return null;
    }
}
