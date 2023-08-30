package CreationalDP.FactoryDP;

public class Runner {
    public static void main(String[] args) {
        Shape triangle = new Triangle("ucgen",60,3);
        triangle.draw();

        Shape square = new Square("dortgen",60,3);
        square.draw();

        Shape pentagon = new Pentagon("besgen",60,3);
        pentagon.draw();

        System.out.println("----------------------------------------");

        Shape shape1 = ShapeFactory.getShape(ShapeType.UCGEN);
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape(ShapeType.DORTGEN);
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape(ShapeType.BESGEN);
        shape3.draw();
    }
}
