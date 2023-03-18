package TerminalCafe;

import java.util.*;

public class TerminalCafe
{
    public static void main(String [] args) 
    {
        Menu menu = new Menu();
        boolean end = false;
        int selection;
        Scanner keyboard = new Scanner(System.in);

        while (!end)
        {
            System.out.println("+==== Menu ===+");

            menu.printMenu();

            System.out.println("+=============+");

            System.out.println("[1] View Menu.");
            System.out.println("[2] Add Menu Item.");
            System.out.println("[3] Delete Menu Item.");
            System.out.println("[4] End.");

            selection = keyboard.nextInt();

            switch (selection){
                case 1:
                    menu.printMenu();
                    continue;
                case 2:
                    menu.addItem();
                    continue;
                case 3:
                    menu.deleteItem();
                    continue;
                case 4:
                    end = true;
                    continue;
                default:
                    continue;
            }

        }
        keyboard.close();
    }
}