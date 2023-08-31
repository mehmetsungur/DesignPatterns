package CreationalDP.ProtoTypeDP;

public class Runner {
    public static void main(String[] args) {
        Soldier soldierAvailable = new Soldier(100,20,60, "G3", true);
        Soldier soldierNotAvailable = new Soldier(60,20,60, "Deegle", false);
        Soldier soldierWeapon = new Soldier(100,20,60, "Arrow", true);

        Soldier soldier = soldierAvailable.clone();

        System.out.println("********************");

        soldierAvailable.printInfo();
        soldier.printInfo();

        System.out.println();
        System.out.println("********************");

        Soldier soldier1 = soldierAvailable.clone();
        soldier1.setAvailable(false);
        soldier.printInfo();
    }
}
