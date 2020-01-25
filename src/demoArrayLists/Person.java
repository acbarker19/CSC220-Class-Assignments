/*
 * Jim Klayder -- spring 2018

simple Person class
 */
package demoArrayLists;

public class Person
{
    private String name;
    private int age;

    public Person()
    {
        name = "???";
        age = 0;
    }


    public Person(
        String name,
        int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String toString()
    {
            return 
            "   name  " + name +
            "   age  " + age;
    }

    public static void main(String args[])
    {
            System.out.println("test code for Person constructor with no parameters");
            Person temp = new Person();
            System.out.println("temp.toString()       "+temp.toString() );
            System.out.println("temp.getName()   "+temp.getName() );
            System.out.println("temp.getAge()   "+temp.getAge() );

            System.out.println("test code for Person constructor with parameters");
            temp = new Person("Bob", 1);
            System.out.println("temp.getName()   "+temp.getName() );
            System.out.println("temp.getAge()   "+temp.getAge() );

            System.out.println("now try all of the setters");
            temp.setName("Alice");
            temp.setAge(1100);


            System.out.println("temp.getName()   "+temp.getName() );
            System.out.println("temp.getAge()   "+temp.getAge() );
    }

}

