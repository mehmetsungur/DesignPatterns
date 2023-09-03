package StructuralDP.ProxyDP;

public class Runner {
    public static void main(String[] args) {
        RealClass realObject = new RealClass("C:\\image.jpg");
        System.out.println(realObject.name);
        realObject.changeFormat();

        System.out.println("*************");

        ProxyClass proxyObject = new ProxyClass("C:\\image.jpg");
        proxyObject.showImage();
    }
}
