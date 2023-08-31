package CreationalDP.AbstractFactoryDP;

public class Runner {
    public static void main(String[] args) {
        AbstractFactory<Shape> shapeFactory = FactoryProducer.getFactory("şekil");
        Shape dortgen = shapeFactory.getObject("kare");
        dortgen.draw();

        AbstractFactory<Color> colorFactory = FactoryProducer.getFactory("renk");
        Color blue = colorFactory.getObject("blue");
        blue.fill();

        System.out.println("********************************************************");

        Shape ucgen = (Shape) FactoryProducer.getFactory("şekil").getObject("ucgen");
        ucgen.draw();

        Color red = (Color) FactoryProducer.getFactory("renk").getObject("red");
        red.fill();
    }
}
