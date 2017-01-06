import java.util.Scanner;

public class gameHealth
{	
	static String [] health;
	static int HEALTHLOAD = 6;
	static int healthCount;

	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);		
		String turn = ""; 
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
		
		while(!(turn.equals("Q")) && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = kb.nextLine();
			damage = (int)(Math.random() * 2) + 1;
			amount = (int)(Math.random() * 6) + 1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!!!");
	}
	
	public static String takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			healthCount = healthCount - amt;
			return ("Taking " + amt + " damage!");
		}
		else
		{
			if(HEALTHLOAD > (healthCount + amt))
			{
				healthCount = healthCount + amt;
			}
			else
			{
				healthCount = HEALTHLOAD;
			}
			return ("Power up " + amt + "!");
		}
	}
	
	public static void printClip()
	{
		String output = "Health:" + "\t";
		
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
			}	
			output = output + health[i];
		}
		System.out.println(output);
	}	
}	