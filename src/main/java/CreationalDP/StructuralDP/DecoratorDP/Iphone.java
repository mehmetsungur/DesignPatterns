package CreationalDP.StructuralDP.DecoratorDP;

public class Iphone implements Phone {
    @Override
    public String getName() {
        return "iPhone";
    }

    @Override
    public int getCameraCount() {
        return 3;
    }

    @Override
    public double getPrice() {
        return 15000;
    }
}
