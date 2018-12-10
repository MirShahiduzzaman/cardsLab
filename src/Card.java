public class Card
{
    String rank, suit;
    int pointValue;

    public Card(String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public boolean equals(Card otherCard)
    {
        if(this.pointValue == otherCard.pointValue)
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return(this.rank + " of " + this.suit + " Point Value: " + this.pointValue);
    }
}
