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


        while(battleOn) {
            System.out.println("An enemy is approaching!");
            System.out.println("Choose an option (1-3)");
            System.out.println("1. Attack");
            System.out.println("2. Heal");
            System.out.println("3. Run Away");

            userInput = bScan.nextInt();

            switch(userInput) {
                case 1:
                    h.attack(e1);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("YOU ATTEMPT TO RUN");
                    Random r = new Random();


                    break;
                default:
                    System.out.println("ERROR; DIFFERENT OPTION");
                    break;

            }
            e1.attack(h);

        }
    }

}
