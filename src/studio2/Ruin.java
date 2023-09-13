package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Starting amount?");
		double startAmount = in.nextDouble();
		System.out.println("Win Chance?");
		double winChance = in.nextDouble();
		System.out.println("Win Limit?");
		double winLimit = in.nextDouble();
		System.out.println("Total Simulations?");
		double totalSimulations = in.nextDouble();
		boolean win = false;
double chance = 0;
double currentAmount = startAmount ;



for (int i = 1; i <=totalSimulations; i++)
{





while (currentAmount > 0 && currentAmount < winLimit)
{
	chance = (Math.random())*100;

if (chance >= winChance)
{ 
	//System.out.println("lose");
	currentAmount -=1;
}

if (chance < winChance)
{
	//System.out.println("win");
	currentAmount +=1;

}
	
System.out.println(currentAmount);
}

if (currentAmount <= 0)
{
System.out.println("ruin");
}

if (currentAmount > winLimit)
{
	//System.out.println("success");
}
System.out.println("Simulation" + i + ":");
}


	}
}