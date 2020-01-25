//Modified by Alec Barker

/* Jim Klayder -- spring 2016

   This is a MultiCard class that has an array of Card objects as the 
   basic data structure. There is only one constructor that fills the
   array with 52 cards which make a deck of cards.

   The fillCardList() method fills the array data member. 

   Use the main method to test this class and to see how to use the included
   methods.

   Add lots of your own methods to this class. Here are some of the 
   possibiliites:

   * get a card at a given index
   * change the value of a card at a given index to a given value
   * set the card at a given index to a given card
   * is there a card with a given value
   * how many cards have the same suit as a given suit
   * get a random card
   * swap the cards at 2 given indexes (change the order of the 2 cards in the array)
   * shuffle (call swap many times with 2 random indexes)
 

*/

public class MultiCard
{
    private Card[] list;

    public MultiCard()
    {
        fillCardList();

    }

    private void fillCardList()
    {
        list = new Card[52];
        
        int currentValue = 1;
        for (int i = 0; i < 52; i += 4) {
            list[i] = new Card("clubs", currentValue);
            list[i+1] = new Card("diamonds", currentValue);
            list[i+2] = new Card("hearts", currentValue);
            list[i+3] = new Card("spades", currentValue);
            currentValue++;
        }
        
    }



    public int getIndexOfCard(String theSuit, int theValue)
    {
        for (int i=0; i < list.length; i++)
        {
            if (list[i].getSuit().equals(theSuit) && list[i].getValue() == theValue)
            return i;
        }
        return -999;
    }
    
    public Card getCardAtIndex(Integer i){
        if(i > 52 || i < 0){
            return list[0];
        }
        else{
            return list[i];
        }
    }
    
    public int getTotalValue()
    {
        int total = 0;
        for (int i=0; i < list.length; i++)
        {
//            System.out.println("i "+i);
            total += list[i].getValue();
        }
        return total;
    }
    
    
    public String toString()
    {
        String result = "MultiCard has "+list.length+" cards\n";
        for (int i=0; i < list.length; i++)
        {
            //System.out.println(i+".  "+list[i].toString());
            result += "list["+i+"]     "+list[i].toString() + "\n";
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println("test code for MultiCard class");
        MultiCard temp = new MultiCard();
        System.out.println("temp.toString()       "+temp.toString() ); 
        System.out.println("\n\n\n");
        System.out.println("temp.getTotalValue()      "+temp.getTotalValue() ); 
        System.out.println("\n\n\n");
        System.out.println("temp.getIndexOfCard(\"hearts\", 1)      "+temp.getIndexOfCard("hearts", 1) ); 
        System.out.println("\n\n\n");
        System.out.println("temp.getIndexOfCard(\"hearts\", 123)      "+temp.getIndexOfCard("hearts", 123) ); 
        System.out.println(temp.getCardAtIndex(10).toString());
        System.out.println(temp.getCardAtIndex(203).toString());
        System.out.println(temp.getCardAtIndex(15).toString());
        
    }
}


