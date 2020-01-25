/* Jim Klayder -- spring 2018

simple demo of using an ArrayList

Here are the ArrayList methods used in this demo.

constructor
add
add with index
remove with index
isEmpty

With just those 5 methods you can do all you need to do with an ArrayList.

Of course, there are lots of other handy and amazing methods
that you might want to investigate.

https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

 */
package demoArrayLists;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo_1
{

    public static void main(String args[])
    {
        System.out.println("test code for ArrayListDemo_1 with default constructor and no data members");

        ArrayList list;
        list = new ArrayList();
        
        String temp = "hello";
        list.add(temp);
        
        temp = "out";
        list.add(temp);
        
        temp = "there";
        list.add(temp);
        
        System.out.println("show list using a for loop");
        for (int i = 0; i < list.size(); i++) 
        {
            //////////////
            // Note that we cast the item that we get as a String becuase
            // we know that the item we put in was a String.
            // (We could have put any type of Object into the ArrayList.)
            //////////////
            String data = (String)list.get(i);
            System.out.println("data "+i+"      "+data);
        }
        
        //another way to loop through the list
        //using an Iterator
        
        System.out.println("show list using an Iterator");
        Iterator myIterator = list.iterator();

        while(myIterator.hasNext())
        {
            String data = (String)myIterator.next();
            System.out.println("data         "+data);
        }

 
        //we can add to the list dynamically
        System.out.println("\n\ndynamically add another item to the list");
        temp = "again";
        list.add(temp);
        
        System.out.println("show list using a for loop");
        for (int i = 0; i < list.size(); i++) 
        {
            String data = (String)list.get(i);
            System.out.println("data "+i+"      "+data);
        }

        System.out.println("\n\nwe can add something to the beginning of the list");
        temp = "start";
        list.add(0, temp);
        
        System.out.println("show list using a for loop");
        for (int i = 0; i < list.size(); i++) 
        {
            String data = (String)list.get(i);
            System.out.println("data "+i+"      "+data);
        }
        
        System.out.println("\n\nwe can even add something in the middle of the list");
        temp = "middle";
        list.add(3, temp);
        
        System.out.println("show list using a for loop");
        for (int i = 0; i < list.size(); i++) 
        {
            String data = (String)list.get(i);
            System.out.println("data "+i+"      "+data);
        }
            
        
        System.out.println("\n\nand we can remove elements from the list using an index");
        temp = (String)list.remove(0);
        System.out.println("removed item is -- "+temp);
        
        System.out.println("show list using an Iterator");
        myIterator = list.iterator();

        while(myIterator.hasNext())
        {
            String data = (String)myIterator.next();
            System.out.println("data         "+data);
        }
        
        System.out.println("\n\nso now remove something from the middle at index 2");
        temp = (String)list.remove(2);
        System.out.println("removed item is -- "+temp);
        
        System.out.println("show list using an Iterator");
        myIterator = list.iterator();

        while(myIterator.hasNext())
        {
            String data = (String)myIterator.next();
            System.out.println("data         "+data);
        }
            
        boolean listIsEmpty = list.isEmpty();
        System.out.println("\n\nlistIsEmpty -- "+listIsEmpty);
        
        
        System.out.println("now remove 2 items");
        list.remove(0);
        list.remove(list.size() - 1);
        
        System.out.println("show list using an Iterator");
        myIterator = list.iterator();

        while(myIterator.hasNext())
        {
            String data = (String)myIterator.next();
            System.out.println("data         "+data);
        }
        
        listIsEmpty = list.isEmpty();
        System.out.println("\n\nlistIsEmpty -- "+listIsEmpty);
        
        System.out.println("\n\n       remove 2 more items");
        list.remove(0);
        list.remove(0);
        
        listIsEmpty = list.isEmpty();
        System.out.println("\n\nlistIsEmpty -- "+listIsEmpty);
        
        
            
    }

}

