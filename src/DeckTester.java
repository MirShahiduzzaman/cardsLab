public class DeckTester
{
    public static void main(String[] args)
    {
        Card temp;

        String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] suit = {"D", "C", "H", "S"};
        int[] pointValue = {2,3,4,5,6,7,8,9,10,11,12,13,14};

        Deck deck1 = new Deck(rank,suit,pointValue);
        deck1.shuffle();

        System.out.println(deck1.size());

        while(!deck1.isEmpty())
        {
            temp = deck1.deal();
            System.out.println(temp);
        }
        System.out.println(deck1.size());
    }
}
