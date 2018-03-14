//Mamadou Diallo
//And so the journey begins. I only paid attention slightly so I'm going to learn as I go along
import java.util.Random;
import java.util.ArrayList;
public class Deck {
	private ArrayList<Card> Undealt;
	private ArrayList<Card> dealt;
	public void deck(String[]rank, String[]suit, int[]value)
	{
		for(int i = 0; i < rank.length; i++)
		{
			for(int j = 0; j < suit.length;)
			{
				Undealt.add(new Card(rank[i], suit[j], value[i]));
			}
		}
	}
	public ArrayList<Card> getDealt() {
		return dealt;
	}
	public void setDealt(ArrayList<Card> dealt) {
		this.dealt = dealt;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
