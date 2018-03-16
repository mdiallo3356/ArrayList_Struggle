//Mamadou Diallo
//And so the journey begins. I only paid attention slightly so I'm going to learn as I go along
import java.util.Random;
import java.util.ArrayList;
public class Deck {
	private ArrayList<Card> Undealt;
	private ArrayList<Card> dealt;
	String[]rank= {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
	String[]suit= {"Spades","Hearts","Clubs","Diamonds"};
	int[]value= {13,12,11,10,9,8,7,6,5,4,3,2,1};
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
	public void setDealt(ArrayList<Card> dealt) 
	{
		this.dealt = dealt;
	}
	public boolean isEmpty()
	{
		if(Undealt.size() == 0)
			{
				return true;
			}
			else return false;
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
