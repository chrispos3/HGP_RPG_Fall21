import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        //game objects and characters
        Hero h = new Hero();
        Enemy e1 = new Enemy();
        World w = new World();
        Scanner scan = new Scanner(System.in);
        boolean gameOn = true;




        System.out.println("Welcome to the HPG RPG!");
        System.out.println("Now IVO is establishing his presence.");

        //main menu loop
        while (gameOn) {
            System.out.println("Choose an option: (1-5):");
            System.out.println("1. Roam the world");
            System.out.println("2. Check hero Stats");
            System.out.println("3. Shop");
            System.out.println("4. Final Boss Battle");
            System.out.println("5. Quit game");


            int userInput = scan.nextInt();

            switch(userInput) {
                case 1:
                    //roam
                    //10% change treasure; 10% chance nothing; 10% stronger enemy; 70% normal enemy
                    //player chooses attack option first
                    //attack; flee; heal;
                    //enemy attacks
                    //Continue looping until enemy OR player is dead
                    //if player is dead = game over; if enemy is dead = loot item, updates stats, shows stats
                    w.roamTheWorld(h, e1);
                    break;
                case 2:
                    //check stats
                    System.out.println("");
                    System.out.println("Stats:");
                    System.out.println(h.toString());
                    System.out.println(" ");
                    break;
                case 3:
                    //shop
                    break;
                case 4:
                    //final boss
                    break;
                case 5:
                    //end game
                    gameOn = false;
                    System.out.println("Thanks for playing!");
                    break;
                default:
                    System.out.println("INVALID INPUT. TRY AGAIN.");
                    break;
            }


        }


//        while (true) {
//            //hero attack
//            h.attack(e1);
//            System.out.println("Hero health: " + h.getHealth());
//
//            //enemy attack
//            e1.attack(h);
//            System.out.println("Enemy health: " + e1.getHealth());
//
//            if (h.getHealth() <= 0 || e1.getHealth() <= 0) {
//                break;
//            }
//
//      }

    }
}
