import java.util.Random;

public class FinalBoss {
    private int health;
    private int attackPower;


        FinalBoss() {
            this.health = 500;
            this.attackPower = 20;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getAttackPower() {
            return attackPower;
        }

        public void setAttackPower(int attackPower) {
            this.attackPower = attackPower;
        }


    @Override
    public String toString() {
        return "FinalBoss{" +
                "health=" + health +
                ", attackPower=" + attackPower +
                '}';
    }

    void attack(Hero h) {
            Random r = new Random();
            //20% of the time it is a CRITICAL HIT, 2 * AP
            int rand = r.nextInt(10) + 1;
            if (rand <= 8) {
                int tempH = h.getHealth() - attackPower;
                h.setHealth(tempH);
                System.out.println("THE ENEMY ATTACKED DOING " + attackPower + " DAMAGE!");
                System.out.println("HERO HAS " + h.getHealth() + " HEALTH!");
            } else if (rand == 9) {
                //critical
                int tempH = h.getHealth() - attackPower * 5;
                h.setHealth(tempH);
                System.out.println("THE IMPOSTER GOT A CRITICAL STRIKE!!!");
                System.out.println("THE IMPOSTER DID " + (attackPower * 5) + " DAMAGE");
                System.out.println("HERO HAS " + h.getHealth() + " HEALTH!");
            } else if (rand == 10) {
                //miss
                System.out.println("THE IMPOSTER MISSED!!!");
                System.out.println("HERO HAS " + h.getHealth() + " HEALTH!");
            }
        }


}



