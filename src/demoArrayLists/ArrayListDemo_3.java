
/* Jim Klayder -- spring 2018

 demo of using an ArrayList data member in a class

In ArrayListDemo_2 the queue could store any type of data because the objects
in the list were handled as the most super of super classes -- Object.

Note the return type of 'removeFromBeginningOfList' in ArrayListDemo_2.

////////////////
But sometimes you might want to make certain that everything in your
data structure is of a given type.

////////////
So in this example, everything in the queue must be a Person.

 */
package demoArrayLists;

import java.util.ArrayList;


public class ArrayListDemo_3
{
    private ArrayList<Person> list;

    public ArrayListDemo_3()
    {
        list = new ArrayList();
    }
    
    public void addToEndofList(Person theObject)
    {
        list.add(theObject);
    }
    
    public void showList()
    {
        System.out.println("show list using a for loop");
        for (int i = 0; i < list.size(); i++) 
        {
            Person data = list.get(i);
            System.out.println("data "+i+"      "+data.toString());
        }
    }
    
    public Person removeFromBeginningOfList()
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
        ArrayListDemo_3 temp = new ArrayListDemo_3();

        boolean listIsEmpty = temp.isEmpty();
        System.out.println("\n\nlistIsEmpty -- "+listIsEmpty);

        temp.addToEndofList(new Person("Alice",8));
        temp.addToEndofList(new Person("Bob",3));
        temp.addToEndofList(new Person("Cathy",13));
        temp.addToEndofList(new Person("Doug",2));
        
        System.out.println("after adding four items");
        listIsEmpty = temp.isEmpty();
        System.out.println("\n\nlistIsEmpty -- "+listIsEmpty);

        temp.showList();

        ////////////
        // Note that a cast is not needed in the following line of code
        // becuase we are guaranteed that the removed object is a Person.
        ////////////
        
        Person myPerson = temp.removeFromBeginningOfList();
        System.out.println("the removed Person was -- "+myPerson.toString());

        System.out.println("\nand here is the list with one Person removed");
        temp.showList();


        System.out.println("\ntemp.toString()  "+temp.toString());
    }

}

