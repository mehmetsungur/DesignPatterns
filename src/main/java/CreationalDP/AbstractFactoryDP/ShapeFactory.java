package CreationalDP.AbstractFactoryDP;

public class ShapeFactory implements AbstractFactory<Shape> {
    @Override
    public Shape getObject(String objectType) {
        return null;
    }

    public static Shape getShape(String type){
        if(type.equalsIgnoreCase("ucgen")){
            return new Triangle("ucgen",60,3);
        }else if(type.equalsIgnoreCase("dortgen")){
            return new Triangle("dortgen",90,4);
        }else if(type.equalsIgnoreCase("besgen")){
            return new Triangle("besgen",180,5);
        }
        return null;
    }
}
