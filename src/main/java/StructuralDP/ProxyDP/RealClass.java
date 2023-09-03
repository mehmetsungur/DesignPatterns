package StructuralDP.ProxyDP;

public class RealClass implements ImageGenerator{
    public String fullPath;
    public String name;

    public RealClass(String fullPath){
        this.fullPath = fullPath;
        this.name = "resim";
        loadImage();
    }

    @Override
    public void showImage() {
        System.out.println(this.name + " showing" + this.fullPath);
    }

    public void loadImage(){
        System.out.println("Image loading");
    }

    public void changeFormat(){

    }
}
