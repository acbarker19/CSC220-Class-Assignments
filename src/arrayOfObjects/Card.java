//Modified by Alec Barker

/* Jim Klayder -- spring 2016

   This is a basic Card class with constructors, getters, setters, 
   toString, and main methods.

   Validity checks should be added to the setters.

   Use the main method to test this class and to see how to use the included
   methods.
*/
public class Card
{
    private String suit;
    private int value;

    public Card()
    {
        suit = "clubs";
        value = 11;
    }


    public Card(
        String suit,
        int value)
    {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() { return suit; }
    public int getValue() { return value; }

    public void setSuit(String suit)
    {
        this.suit = suit;
    }

    public void setValue(int value)
    {
        if(value > 0 && value <= 100){
            this.value = value;
        }
        else{
            System.out.println("in Card.setValue --- can't use value of " + value);
            System.out.println("setting value to 100");
            this.value = 100;
        }
    }

    public String toString()
        {
            return 
            "   suit  " + suit +
            "   value  " + value;
    }

    public static void main(String args[]) {
        System.out.println("test code for Card constructor with no parameters");
        Card temp = new Card();
        System.out.println("temp.toString()       "+temp.toString() ); 
        System.out.println("temp.getSuit()      "+temp.getSuit() ); 
        System.out.println("temp.getValue()      "+temp.getValue() ); 

        System.out.println("\ntest code for Card constructor with parameters");
        temp = new Card("hearts", 6);
        System.out.println("temp.toString()       "+temp.toString() ); 
        System.out.println("temp.getSuit()      "+temp.getSuit() ); 
        System.out.println("temp.getValue()      "+temp.getValue() ); 

        temp.setSuit("spades"); 
        temp.setValue(7); 

        System.out.println("\nafter calling setters");
        //now call all of the getters again
        System.out.println("temp.getSuit()      "+temp.getSuit() ); 
        System.out.println("temp.getValue()      "+temp.getValue() ); 
    }
}
