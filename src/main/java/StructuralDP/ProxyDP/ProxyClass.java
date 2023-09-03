package StructuralDP.ProxyDP;

public class ProxyClass implements ImageGenerator {
    private RealClass realClass;

    public String fullPath;

    public ProxyClass(String fullPath){
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {
        if(realClass == null){
            this.realClass = new RealClass(fullPath);
        }

        realClass.showImage();
    }
}
