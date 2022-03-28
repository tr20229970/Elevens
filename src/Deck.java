import java.util.ArrayList;


public class Deck
{
    private ArrayList<Card> deckArray = new ArrayList<Card>();
    int size;

    Deck(String[] inputRank, String[] inputSuit, int[] inputValue)
    {
        for(int i = 0; i < inputRank.length ; i++)
            for(int k = 0; k < inputSuit.length ; k++ )
                deckArray.add(new Card(inputRank[i], inputSuit[k], inputValue[i]));
        size = deckArray.size();
    }

    public boolean isEmpty()
    {
        return deckArray.isEmpty();
    }
    public int size()
    {
        return size;
    }
    public Card deal()
    {
        if(size <= 0 )
            return null;

        size--;

        return deckArray.get(size);
    }
    public  void shuffle()
    {
        for (int k = deckArray.size() - 1; k > 0; k--)
        {
            int pos = (int) (Math.random() * (k + 1));  // range 0 to k, inclusive
            Card temp = deckArray.get(pos);
            deckArray.set(pos, deckArray.get(k));
            deckArray.set(k, temp);
        }
    }

    public String toString()
    {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + deckArray.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = deckArray.size() - 1; k >= size; k--) {
            rtn = rtn + deckArray.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - deckArray.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }

}
