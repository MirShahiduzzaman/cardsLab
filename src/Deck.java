import java.util.ArrayList;
import java.util.List;

public class Deck
{
    ArrayList<Card> unDealt;
    ArrayList<Card> Dealt;

    public Deck(String[] rank,String[] suit,int[] pointValue)
    {
        unDealt = new ArrayList<>();

        for(int i = 0;i<rank.length;i++)
        {
            for(int a = 0;a<rank.length;a++)
            {
                for(int b = 0;b<rank.length;b++)
                {
                    Card newCard = new Card(rank[i],suit[a],pointValue[b]);
                    unDealt.add(newCard);
                }
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

        //Shuffles Dealt deck
        for(int k = Dealt.size()-1; k>0; k--)
        {
            r = (int)(Math.random()*k);

            temp = Dealt.get(r);
            Dealt.set(r,Dealt.get(k));

            Dealt.set(k,temp);
        }

        //Places shuffled Dealt Cards to unDealt Pile
        //Also removes the same cards from Dealt Deck
        for(int i = 0; i<Dealt.size(); i++)
        {
            unDealt.add(Dealt.get(0));
            Dealt.remove(0);
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
