import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Shop {


    Shop() {

    }

    void enterShop(Hero h, Enemy e1) {
        boolean shopping = true;
        Scanner SScan = new Scanner(System.in);
        int userInput;

        while (shopping) {
            System.out.println("");
            System.out.println("");
            System.out.println("Welcome to my shop!");
            System.out.println("What would you like to buy?");
            System.out.println("Choose an option (1-3)");
            System.out.println("1. ______");
            System.out.println("2. ______");
            System.out.println("3. ______");

            int userInput = scan.nextInt();

            switch(userInput) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("ERROR; DIFFERENT OPTION");
                    break;
            }

        }



}
