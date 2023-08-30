package CreationalDP.FactoryDP;

public class ShapeFactory {
    public static Shape getShape(ShapeType type){
        if(type == ShapeType.UCGEN){
            return new Triangle("ucgen",60,3);
        }else if(type == ShapeType.DORTGEN){
            return new Triangle("dortgen",90,4);
        }else if(type == ShapeType.BESGEN){
            return new Triangle("besgen",180,5);
        }

        return null;
    }
}
