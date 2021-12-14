import java.util.Arrays;
import java.util.Random;

public class Hero {

    //attributes

    private int health;
    private int attackPower;
    private String name;
    private String[] inventory = new String[5];
    private int coins;

    //constructor

    Hero() {
        this.health = 100;
        this.attackPower = 10;
        this.name = "Batman";
        this.inventory[0] = "Potion";
        this.coins = 100;

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

    public void setInvItem(String item, int i) {
        this.inventory[i] = item;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    public int getCoins() {return coins;}

    public void setCoins(int coins) {this.coins = coins;}

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", attackPower=" + attackPower +
                ", name='" + name + '\'' +
                ", inventory=" + Arrays.toString(inventory) +
                ", coins=" + coins +
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

    void giveCoins(Hero h) {
        Random r = new Random();
        int rand = r.nextInt(100) + 1;
        System.out.println("HERO FOUND " + rand + " COINS!");
        int tempC = rand + getCoins();
        setCoins(tempC);
    }

    void increaseStats(Hero h) {
        System.out.println("HERO health has increased by 10!");
        System.out.println("HERO attack power has increased by 5!");
        int tempH = getHealth() + 10;
        setHealth(tempH);

        int tempAP = getAttackPower() + 5;
        setAttackPower(tempAP);
    }

    void heal(Hero h) {
        Random r = new Random();
        int randomHeal = r.nextInt(100) + 1;
        System.out.println("HERO HEALED FOR " + randomHeal + " HEALTH!");
        int tempH = randomHeal + getHealth();
        setHealth(tempH);
        System.out.println("HERO HAS " + getHealth() + " HEALTH REMAINING");

    }


































    }




