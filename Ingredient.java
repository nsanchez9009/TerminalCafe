package TerminalCafe;

public class Ingredient
{
	String name;

	Ingredient next;

	double amount;

	Ingredient(String name, double amount)
	{
		this.name = name;
        this.amount = amount;
	}
}

