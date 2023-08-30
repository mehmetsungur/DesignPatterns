package CreationalDP.FactoryDP;

public class Runner {
    public static void main(String[] args) {
        Shape triangle = new Triangle("ucgen",60,3);
        triangle.draw();

        Shape square = new Square("dortgen",60,3);
        square.draw();

        Shape pentagon = new Pentagon("besgen",60,3);
        pentagon.draw();
    }
}
