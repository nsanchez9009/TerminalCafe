package TerminalCafe;

public class Item
{
	String name;

	Item next;

	// Reference to node with the next character in this string.
	Recipe recipe;

	Item(String name, Recipe recipe)
	{
		this.name = name;
        this.recipe = recipe;
	}
}
