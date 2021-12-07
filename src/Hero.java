import java.util.Arrays;
import java.util.Random;

public class Hero {

    //attributes

    private int health;
    private int attackPower;
    private String name;
    private String[] inventory = new String[5];

    //constructor

    Hero() {
        this.health = 100;
        this.attackPower = 10;
        this.name = "Batman";
        this.inventory[0] = "Potion";
    }


    //methods

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

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
                ", attackPower=" + attackPower +
                ", name='" + name + '\'' +
                ", inventory=" + Arrays.toString(inventory) +
                '}';
    }

    //helper method

    void attack(Enemy e) { //e BECOMES e1, or e2, or e3, ect
        Random r = new Random();
        //20% of the time it is a CRITICAL HIT, 2 * AP
        int rand = r.nextInt(10) + 1;
        if (rand <= 8) {
            int tempH = e.getHealth() - getAttackPower();
            e.setHealth(tempH);
        } else if (rand == 9) {
            //critical
            int tempH = e.getHealth() - getAttackPower() * 2;
            e.setHealth(tempH);
            System.out.println("CRITICAL STRIKE!!!");
        } else if (rand == 10) {
            //miss
            System.out.println("MISS!!!");
        }
    }
    void powerAttack(Enemy e) {
        int eHealth = e.getHealth() - getAttackPower() * 5;
        e.setHealth(eHealth);
        }
    }

