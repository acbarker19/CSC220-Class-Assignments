/* Jim Klayder -- 2015-02-22

   This is a basic Book class with a constructor, getters, setters, 
   toString, and main methods.

   Validity checks should be added to the setters.

   Use the main method to test this class and to see how to use the included
   methods.
*/

public class Book
{
    private String title;
    private String author;
    private int year;

    public Book(
        String title,
        String author,
        int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String toString()
        {
            return 
            "   title  " + title +
            "   author  " + author +
            "   year  " + year;
    }

    public static void main(String args[]) {
        System.out.println("test code for Book class");
        Book temp = new Book("A Christmas Carol", "Charles Dickens", 1843);
        System.out.println("temp.toString()       "+temp.toString() ); 
        System.out.println("temp.getTitle()      "+temp.getTitle() ); 
        System.out.println("temp.getAuthor()      "+temp.getAuthor() ); 
        System.out.println("temp.getYear()      "+temp.getYear() );
        
        temp.setTitle("Watership Down"); 
        temp.setAuthor("Richard Adams"); 
        temp.setYear(1972); 

        System.out.println("after calling setters");
        //now call all of the getters again
        System.out.println("temp.getTitle()      "+temp.getTitle() ); 
        System.out.println("temp.getAuthor()      "+temp.getAuthor() ); 
        System.out.println("temp.getYear()      "+temp.getYear() ); 
    }
}
