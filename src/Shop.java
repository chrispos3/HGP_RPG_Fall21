import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Shop {

    Shop() {

    }

    void enterShop(Hero h, Enemy e1) {
        boolean shopping = true;
        String item1 = "";
        String item2 = "";
        String item3 = "";
        int coinsLost;
        Scanner scan = new Scanner(System.in);
        int userInput;

        while (shopping) {
            System.out.println("");
            System.out.println("");
            System.out.println("Welcome to my shop!");
            System.out.println("Would you like to buy something?");
            String userResponse = scan.nextLine();

            //if player chooses to enter shop, 3 random items and their prices are displayed
            if (userResponse.equals("yes")) {
                Random r = new Random();
                int itemNum = (int) (Math.floor(Math.random() * 3) + 1);

                //item 1 is health
                if (itemNum == 1) {
                    item1 = "birthday cake: 10 coins";
                    coinsLost = 10;
                } else if (itemNum == 2) {
                    item1 = "apple: 5 coins";
                    coinsLost = 5;
                } else {
                    item1 = "healing potion: 20 coins";
                    coinsLost = 20;
                }

                //item 2 is weapons
                itemNum = (int) (Math.floor(Math.random() * 3) + 1);
                if (itemNum == 1) {
                    item2 = "magic sword: 30 coins";
                    coinsLost = 30;
                } else if (itemNum == 2) {
                    item2 = "attack potion: 20 coins";
                    coinsLost = 20;
                } else {
                    item2 = "crossbow: 25 coins";
                    coinsLost = 25;
                }


                //item 3 is armor
                itemNum = (int) (Math.floor(Math.random() * 3) + 1);
                if (itemNum == 1) {
                    item3 = "shield: 20 coins";
                    coinsLost = 20;
                } else if (itemNum == 2) {
                    item3 = "protective boots: 15 coins";
                    coinsLost = 15;
                } else {
                    item3 = "helmet: 15 coins";
                    coinsLost = 15;
                }


                System.out.println(" ");
                System.out.println("Here are today's options:");
                System.out.println(item1);
                System.out.println(item2);
                System.out.println(item3);

                //each item is assigned a number for the player to choose
                System.out.println("Choose any item you want (1-3).");
                int itemIntChoose = scan.nextInt();

                //the integer is converted back to a string so the player can be told the exact item they bought
                String itemChosen = new String();

                if (itemIntChoose == 1) {
                    itemChosen = item1;
                    
                } else if (itemIntChoose == 2) {
                    itemChosen = item2;
                    
                } else if (itemIntChoose == 3) {
                    itemChosen = item3;

                } else {
                    return;
                }
                //the item chosen by the player is added to their inventory
                //coins are subtracted from the player based on what they bought

                h.setInvItem(itemChosen, 0);
                int netCoins = h.getCoins() - coinsLost;

                System.out.println("You chose " + itemChosen + ". You have " + netCoins  + " coins remaining.");
                return;

            }
            else {
                System.out.println(" ");
                System.out.println("Ok :(");
                System.out.println("Come back soon.");
                System.out.println(" ");
                return;
            }


        }
    }
}
