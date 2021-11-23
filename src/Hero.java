import java.util.Arrays;

public class Hero {

    //attributes

    private int health;
    private String name;
    private String[] inventory = new String[5];

    //constructor

    Hero() {
        this.health = 100;
        this.name = "Batman";
        this.inventory[0] = "Potion";
    }


    //methods

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getInventory() {
        return inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", inventory=" + Arrays.toString(inventory) +
                '}';
    }

    //helper method
    void attack(Enemy e) { //e BECOMES e1, or e2, or e3, ect
        int tempH = e.getHealth() - 10;
        e.setHealth(tempH);

    }



}
