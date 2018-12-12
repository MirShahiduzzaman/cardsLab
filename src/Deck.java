import java.util.ArrayList;
import java.util.List;

public class Deck
{
    ArrayList<Card> unDealt;
    ArrayList<Card> Dealt;

    public Deck(String[] rank,String[] suit,int[] pointValue)
    {
        unDealt = new ArrayList<>();
        Dealt = new ArrayList<>();

        for(int i = 0;i<rank.length;i++)
        {
            for(int a = 0;a<suit.length;a++)
            {
                Card newCard = new Card(rank[i],suit[a],pointValue[i]);
                unDealt.add(newCard);
            }
        }
    }

    public boolean isEmpty()
    {
        if(unDealt.size() == 0)
        {
            return true;
        }
        return false;
    }

    public int size()
    {
        return unDealt.size();
    }

    public Card deal()
    {
        if(this.isEmpty())
        {
            return null;
        }

        Card selected = unDealt.get(0);
        Dealt.add(selected);
        unDealt.remove(0);
        return(selected);
    }

    public void shuffle()
    {
        Card temp;
        int r;

        while(Dealt.size()>0)
        {
            unDealt.add(Dealt.remove(0));
        }

        for(int k = this.size()-1; k>0; k--)
        {
            r = (int)(Math.random()*k);

            temp = unDealt.get(r);
            unDealt.set(r,unDealt.get(k));

            unDealt.set(k,temp);
        }
    }

}
