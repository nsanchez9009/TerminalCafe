package TerminalCafe;

import java.util.*;

public class Menu {
    private Item head;
    private Item tail;
    private int menuSize;

    public Menu(){};

    public Item getHead(){
        return head;
    }

    public Item getTail(){
        return tail;
    }

    public int getMenuSize(){
        return menuSize;
    }

    public void printMenu()
    {
        if (menuSize == 0)
        {
            System.out.println("Menu is empty.");
            return;
        }

        Item current = head;
        int number = 0;

        while (current != null) {
            System.out.println(number + ". " + current.name);
            current = current.next;
        }
    }

    public void addItem()
    {   
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Item name: ");
        String itemName = keyboard.nextLine();
        System.out.println();

        keyboard.close();

        Recipe recipe = new Recipe();
        recipe.addIngredients();

        Item item = new Item(itemName, recipe);

        if (menuSize == 0) {
            head = item;
            tail = item;
        }

        else {
            tail.next = item;
            tail = item;
        }
        menuSize++;
    }

    public void deleteItem()
    {

    }

    
}
