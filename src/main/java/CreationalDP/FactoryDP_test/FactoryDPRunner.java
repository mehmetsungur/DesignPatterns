package CreationalDP.FactoryDP_test;

import CreationalDP.FactoryDP.Shape;
import CreationalDP.FactoryDP.ShapeType;
import CreationalDP.FactoryDP.ShapeFactory;

public class FactoryDPRunner {
    public static void main(String[] args) {
        Shape dortgen = ShapeFactory.getShape(ShapeType.DORTGEN);
        dortgen.draw();
    }
}
