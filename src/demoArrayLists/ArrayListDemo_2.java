
/* Jim Klayder -- spring 2018

 demo of using an ArrayList data member in a class

This demo will show how to make a data structure that behaves like a line
of people in a grocery store check out line.

New arrivals are added to the end of the list.

New departures are removed from the beginning of the list.

In computer science we call a data structure 
that behaves this way a queue.

Note that the user of ArrayListDemo_2 can only add new items to the 
end of the list. The reason is that the data is private, so the only
way to add to the list is to call the 'addToEndofList' method.

Also, the only way to remove an item is to call 
the 'removeFromBeginningOfList' method.

Here is a little exercise for you. Make a demo class of your own that
has an ArrayList private data member where the class behaves like a stack
of plates in a cafeteria. That is, items can only be added to the top of 
the stack and removed from the top of the stack.

 */
package demoArrayLists;

import java.util.ArrayList;


public class ArrayListDemo_2
{
    private ArrayList list;

    public ArrayListDemo_2()
    {
        list = new ArrayList();
    }
    
    public void addToEndofList(Object theObject)
    {
        list.add(theObject);
    }
    
    public void showList()
    {
        System.out.println("show list using a for loop");
        for (int i = 0; i < list.size(); i++) 
        {
            Object data = (Object)list.get(i);
            System.out.println("data "+i+"      "+data.toString());
        }
    }
    
    //Added by Alec Barker
/*    public void removeSpades(){
        System.out.println();
        for(Integer i = 0; i < list.size(); i++){
            if(list.get(i).getSuit().equals("spades")){
                list.remove(i);
            }
        }
    }
*/    
    public Object removeFromBeginningOfList()
    {
        return list.remove(0);
    }
    
    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public String toString()
    {
            return 
            "   list.toString()  " + list.toString();
    }

    public static void main(String args[])
    {
        ArrayListDemo_2 temp = new ArrayListDemo_2();

        boolean listIsEmpty = temp.isEmpty();
        System.out.println("\n\nlistIsEmpty -- "+listIsEmpty);

        temp.addToEndofList(new Card("spades",8));
        temp.addToEndofList(new Card("hearts",3));
        temp.addToEndofList(new Card("clubs",13));
        temp.addToEndofList(new Card("diamonds",2));
        
        System.out.println("after adding four items");
        listIsEmpty = temp.isEmpty();
        System.out.println("\n\nlistIsEmpty -- "+listIsEmpty);

        temp.showList();

        Card myCard = (Card)temp.removeFromBeginningOfList();
        System.out.println("the removed Object was a Card -- "+myCard.toString());

        System.out.println("\nand here is the list with one Object removed");
        temp.showList();


        System.out.println("\ntemp.toString()  "+temp.toString());
    }

}

