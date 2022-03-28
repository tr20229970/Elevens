public class Card
{
    private String _rank;
    private String _suit;
    private int _value;

    public Card(String inputRank, String inputSuit, int inputValue)
    {
        _rank = inputRank;
        _suit = inputSuit;
        _value = inputValue;
    }
    public String rank()
    {
        return _rank;
    }
    public String suit()
    {
        return _suit;
    }
    public int pointValue()
    {
        return _value;
    }
    public boolean matches(Card otherCard)
    {
        return (otherCard.pointValue() == pointValue()) && (otherCard.rank().equals(rank())) && (otherCard.suit().equals(suit()));
    }
    public String toString()
    {
        return rank() + " of " + suit() +  " (point value = " + pointValue() + ")";
    }
}
