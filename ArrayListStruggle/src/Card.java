
public class Card {
	private String rank;
	private String suit;
	private int pointValue;
	public Card(String rank, String suit, int pointValue) 
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	public String Getrank()
	{
		return rank;
	}
	public String Getsuit()
	{
		return suit;
	}
	public int GetpointValue()
	{
		return pointValue;
	}
	public String toString()
	{
		return rank + "of" + suit;
	}
}
