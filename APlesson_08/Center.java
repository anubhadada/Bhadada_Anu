import java.util.Scanner;
public class Center
{
	static String word1;
	static String word2;
	static String word3;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		word1 = kb.next();
		System.out.println("Please enter a second word: ");
		word2 = kb.next();
		System.out.println("Please enter a third word: ");
		word3 = kb.next();
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
			return word;	
		else
		{
			word = " " + word + " ";
			return makeCenter(word); 
		}
	}
}