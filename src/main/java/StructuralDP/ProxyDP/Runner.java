package StructuralDP.ProxyDP;

public class Runner {
    public static void main(String[] args) {
        RealClass realObject = new RealClass("C:\\image.jpg");
        System.out.println(realObject.fullPath);
        System.out.println(realObject.name);
    }
}
