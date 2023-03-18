package TerminalCafe;

import java.util.*;

public class Recipe {
    Ingredient head;
    Ingredient tail;
    int recipeSize;
    boolean end = false;

    Scanner keyboard = new Scanner(System.in);

    public Recipe(){};

    public void addIngredients()
    {
        while (!end)
        {
            System.out.print("Ingredient name: ");
            String name = keyboard.nextLine();
            System.out.println();

            System.out.print("Amount: ");
            double amount = keyboard.nextDouble();
            System.out.println();

            Ingredient ingredient = new Ingredient(name, amount);

            if (recipeSize == 0)
            {
                head = ingredient;
                tail = ingredient;
            }
            else {
                tail.next = ingredient;
                tail = ingredient;
            }
            recipeSize++;

            System.out.print("Add another? Y/N: ");
            String temp = keyboard.nextLine();
            System.out.println();

            end = (temp.toLowerCase() == "y") ? false : true;
        }
        keyboard.close();
    }
}
