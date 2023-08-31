package CreationalDP.ProtoTypeDP;

public class Soldier implements Cloneable {
    private int health;
    private int maxLifeTime;
    private int power;
    private String weapon;
    private boolean isAvailable;

    public Soldier(int health, int maxLifeTime, int power, String weapon, boolean isAvailable) {
        this.health = health;
        this.maxLifeTime = maxLifeTime;
        this.power = power;
        this.weapon = weapon;
        this.isAvailable = isAvailable;
    }

    public void printInfo(){
        System.out.println();
        System.out.print("Life Time: " + this.maxLifeTime);
        System.out.print(" Health: " + this.health);
        System.out.print(" Weapon: " + this.weapon);
        System.out.print(" Power: " + this.power);

        if (isAvailable){
            System.out.println(" Soldier can in war");
        }else{
            System.out.println(" Soldier can't in war");
        }
    }

    @Override
    public Soldier clone() {
        try {
            Soldier cloneSoldier = (Soldier) super.clone();
            return cloneSoldier;
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone is failed");
            e.printStackTrace();
        }
        return null;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
