import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class World {
    //Attributes


    World() {

    }

    //Helper Methods
    void roamTheWorld(Hero h, Enemy e1) {
        boolean battleOn = true;
        Scanner bScan = new Scanner(System.in);
        int userInput;
        int attackInput;
        String itemUse;
        Random r = new Random();

        int random = r.nextInt(4) + 1;
        if (random == 1 || random == 2) {
            //Nothing happens
            System.out.println("THE HERO TRAVELED ACROSS THE LAND, BUT FOUND NOTHING.");
            return;

        } else if (random == 3) {
            //enemy encounter

            while (battleOn) {
                System.out.println("An enemy is approaching!");
                System.out.println("Choose an option (1-3)");
                System.out.println("1. Attack");
                System.out.println("2. Heal");
                System.out.println("3. Use an Item");
                System.out.println("4. Run Away");

                userInput = bScan.nextInt();


                    switch (userInput) {
                        case 1:

                            System.out.println("Regular attack (1), Magic attack (2), or Power attack (3)");
                            attackInput = bScan.nextInt();
                            switch (attackInput) {

                              case 1:
                                 System.out.println("You attacked the enemy.");
                                 h.attack(e1);


                                case 2:
                                    System.out.println("You used magic on the enemy!");

                                case 3:
                                    System.out.println("You used a power attack on the enemy!");
                                    int r1 = r.nextInt(10) + 1;
                                    if (r1 >= 3) {
                                        System.out.println("ATTACK CONNECTS!");
                                        h.powerAttack(e1);

                                    } else if (r1 <= 4) {
                                        System.out.println("ATTACK MISSES!");
                                    }
                                default:
                                    break;
                            }

                            e1.attack(h);
                            System.out.println("THE ENEMY HAS " + e1.getHealth() + " HEALTH REMAINING!");
                            //  }
                            break;
                        case 2:
                            h.heal(h);
                            e1.attack(h);
                            System.out.println("THE ENEMY HAS " + e1.getHealth() + " HEALTH REMAINING!");
                            break;
                        case 3:
                            System.out.println("Which item would you like to use? (please type in the name of the item)");
                            System.out.println(Arrays.toString(h.getInventory()));
                            itemUse = bScan.next();
                            if (itemUse.equals("birthday cake")) {
                                System.out.println("Yum!");
                            } else if (itemUse.equals("apple")) {
                                System.out.println("An apple a day keeps your enemies away!");
                                System.out.println("That's how the saying goes, right?");
                            } else if (itemUse.equals("healing potion")) {
                                System.out.println("You won't regret this.");
                            } else if (itemUse.equals("magic sword")) {
                                System.out.println("This will prove to be helpful!");
                            } else if (itemUse.equals("attack potion")) {
                                System.out.println("This will prove to be helpful!");
                            } else if (itemUse.equals("crossbow")) {
                                System.out.println("Your enemies are no match for this!");
                            } else if (itemUse.equals("shield")) {
                                System.out.println("This will certainly reduce your damage taken!");
                            } else if (itemUse.equals("protective boots")) {
                                System.out.println("Every bit of armor counts!");
                            } else {
                                System.out.println("Every bit of armor counts!");
                            }

                            break;
                        case 4:
                            System.out.println("YOU ATTEMPT TO RUN");
                            int random2 = r.nextInt(3) + 1;
                            if (random2 == 1 || random2 == 2) {
                                //nothing happens
                                System.out.println("Running was unsuccessful!");
                                e1.attack(h);
                                System.out.println("THE ENEMY HAS " + e1.getHealth() + " HEALTH REMAINING!");
                                break;
                            } else if (random2 == 3) {
                                //hero escapes
                                System.out.println("You managed to run away!");
                                return;
                            }

                            break;
                        default:
                            System.out.println("ERROR; DIFFERENT OPTION");
                            break;

                    }

                    if (e1.getHealth() < 0 || h.getHealth() < 0) {
                        battleOn = false;
                        System.out.println("The battle ended!");
                    }


            }

            } else if (random == 4) {
                //treasure found
                System.out.println("HERO FOUND A TREASURE");
                h.giveCoins(h);

            }


        }

    }

