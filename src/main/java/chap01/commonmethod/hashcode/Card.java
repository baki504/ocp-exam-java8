package chap01.commonmethod.hashcode;

// Whenever you override equals(), you are also expected to override hashCode().
// The hash code is used when storing the object as a key in a map.
public class Card {
    private String rank;
    private String suit;

    public Card(String r, String s) {
        if (r == null || s == null)
            throw new IllegalArgumentException();
        rank = r;
        suit = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Card))
            return false;
        Card c = (Card) obj;
        return rank.equals(c.rank) && suit.equals(c.suit);
    }

    public int hashCode() {
        return rank.hashCode();
    }

}