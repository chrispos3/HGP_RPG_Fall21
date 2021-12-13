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
        Scanner scan = new Scanner(System.in);
        int userInput;

        while (shopping) {
            System.out.println("");
            System.out.println("");
            System.out.println("Welcome to my shop!");
            System.out.println("Would you like to buy something?");
            String userResponse = scan.nextLine();
            if (userResponse.equals("yes")) {
                Random r = new Random();
                int itemNum = (int) (Math.floor(Math.random() * 6) + 1);

                if (itemNum == 1) {
                    item1 = "healing potion: 5 coins";
                } else if (itemNum == 2) {
                    item1 = "shield: 4 coins";
                } else if (itemNum == 3) {
                    item1 = "protective boots: 2 coins";
                } else if (itemNum == 4) {
                    item1 = "apple: 2 coins";
                } else if (itemNum == 5) {
                    item1 = "magic sword: 8 coins";
                } else {
                    item1 = "birthday cake: 3 coins";
                }

                itemNum = (int) (Math.floor(Math.random() * 6) + 1);
                if (itemNum == 1) {
                    item2 = "healing potion: 5 coins";
                } else if (itemNum == 2) {
                    item2 = "shield: 4 coins";
                } else if (itemNum == 3) {
                    item2 = "protective boots: 2 coins";
                } else if (itemNum == 4) {
                    item2 = "apple: 2 coins";
                } else if (itemNum == 5) {
                    item2 = "magic sword: 8 coins";
                } else {
                    item2 = "birthday cake: 3 coins";
                }

                itemNum = (int) (Math.floor(Math.random() * 6) + 1);
                if (itemNum == 1) {
                    item3 = "healing potion: 5 coins";
                } else if (itemNum == 2) {
                    item3 = "shield: 4 coins";
                } else if (itemNum == 3) {
                    item3 = "protective boots: 2 coins";
                } else if (itemNum == 4) {
                    item3 = "apple: 2 coins";
                } else if (itemNum == 5) {
                    item3 = "magic sword: 8 coins";
                } else {
                    item3 = "birthday cake: 3 coins";
                }
                System.out.println(" ");
                System.out.println("Here are today's options:");
                System.out.println(item1);
                System.out.println(item2);
                System.out.println(item3);

                System.out.println("Choose any item you want (1-3).");
                int itemIntChoose = scan.nextInt();

                String itemChosen = new String();

                if (itemIntChoose == 1) {
                    itemChosen.equals(item1);

                } else if (itemIntChoose == 2) {
                    itemChosen.equals(item2);

                } else if (itemIntChoose == 3) {
                    itemChosen.equals(item3);

                } else {
                    return;
                }
                h.setInvItem(itemChosen, 0);
                System.out.println("You chose " + itemChosen + ". You have " + h.getCoins() + " coins remaining.");
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
