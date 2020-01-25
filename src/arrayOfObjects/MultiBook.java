//modified by Alec Barker

/* Jim Klayder -- 2015-02-22

   This is a MultiBook class that has an array of Book objects as the 
   basic data structure. There is only one constructor that fills the
   array with 95 books.
    
    #original source
    #http://www.goodreads.com/topic/show/1301199-100-books-you-must-read-before-you-die

   The fillBookList() method fills the array data member. (Netbeans users
   can click the '-' in the left column to collapse the code for the
   fillBookList() method. That way you won't have to scroll through all
   of the lines of constructor calls.)

   Use the main method to test this class and to see how to use the included
   methods.

   Add lots of your own methods to this class. Here are some of the 
   possibiliites:

   * is there a book with a certain title
   * how many books are there by a certain author
   * get the titles of all the books from a certain decade
   * how many books have a certain word in the title
   * get a list of books ordered by ascending year
   * get a list of books ordered alphabetically by the title
   * get a list of books ordered alphabetically by the last name of the author
   * what is the name of the author who has the most books in the list
   * which decade has the smallest number of books in the list
   * which decade has the largest number of books in the list
 

*/

public class MultiBook
{
    private Book[] list;

    public MultiBook()
    {
        fillBookList();
    }

    private void fillBookList()
    {
        list = new Book[95];
        list[0] = new Book("Pride and Prejudice", "Jane Austen", 1813);
        list[1] = new Book("The Lord of the Rings", "JRR Tolkien", 1954);
        list[2] = new Book("Jane Eyre", "Charlotte Bronte", 1847);
        list[3] = new Book("Harry Potter and The Philosopher's Stone", "JK Rowling", 1997);
        list[4] = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        list[5] = new Book("Wuthering Heights", "Emily Bronte", 1847);
        list[6] = new Book("Nineteen Eighty Four", "George Orwell", 1949);
        list[7] = new Book("His Dark Materials", "Philip Pullman", 1995);
        list[8] = new Book("Great Expectations", "Charles Dickens", 1860);
        list[9] = new Book("Little Women", "Louisa M Alcott", 1880);
        list[10] = new Book("Tess of the D’Urbervilles", "Thomas Hardy", 1891);
        list[11] = new Book("Catch 22", "Joseph Heller", 1961);
        list[12] = new Book("Rebecca", "Daphne Du Maurier", 1938);
        list[13] = new Book("The Hobbit", "JRR Tolkien", 1937);
        list[14] = new Book("Birdsong", "Sebastian Faulk", 1993);
        list[15] = new Book("Catcher in the Rye", "JD Salinger", 1951);
        list[16] = new Book("The Time Traveler’s Wife", "Audrey Niffenegger", 2003);
        list[17] = new Book("Middlemarch", "George Eliot", 1874);
        list[18] = new Book("Gone With The Wind", "Margaret Mitchell", 1936);
        list[19] = new Book("The Great Gatsby", "F Scott Fitzgerald", 1925);
        list[20] = new Book("War and Peace", "Leo Tolstoy", 1869);
        list[21] = new Book("The Hitch Hiker’s Guide to the Galaxy", "Douglas Adams", 1979);
        list[22] = new Book("Crime and Punishment", "Fyodor Dostoyevsky", 1866);
        list[23] = new Book("Grapes of Wrath", "John Steinbeck", 1939);
        list[24] = new Book("Alice in Wonderland", "Lewis Caroll", 1865);
        list[25] = new Book("The Wind in the Willows", "Kenneth Grahame", 1908);
        list[26] = new Book("Anna Karenina", "Leo Tolstoy", 1877);
        list[27] = new Book("David Copperfield", "Charles Dickens", 1850);
        list[28] = new Book("The Lion, the Witch, and the Wardrobe", "CS Lewis", 1950);
        list[29] = new Book("Emma", "Jane Austen", 1815);
        list[30] = new Book("Persuasion", "Jane Austen", 1817);
        list[31] = new Book("The Kite Runner", "Khaled Hosseini", 2002);
        list[32] = new Book("Captain Corelli’s Mandolin", "Louis De Bernieres", 1994);
        list[33] = new Book("Memoirs of a Geisha", "Arthur Golden", 1997);
        list[34] = new Book("Winnie the Pooh", "A.A. Milne", 1926);
        list[35] = new Book("Animal Farm", "George Orwell", 1945);
        list[36] = new Book("The Da Vinci Code", "Dan Brown", 2003);
        list[37] = new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 1967);
        list[38] = new Book("A Prayer for Owen Meaney", "John Irving", 1989);
        list[39] = new Book("The Woman in White", "Wilkie Collins", 1859);
        list[40] = new Book("Anne of Green Gables", "LM Montgomery", 1908);
        list[41] = new Book("Far From The Madding Crowd", "Thomas Hardy", 1874);
        list[42] = new Book("The Handmaid’s Tale", "Margaret Atwood", 1985);
        list[43] = new Book("Lord of the Flies", "William Golding", 1954);
        list[44] = new Book("Atonement", "Ian McEwan", 2001);
        list[45] = new Book("Life of Pi", "Yann Martel", 2001);
        list[46] = new Book("Dune", "Frank Herbert", 1965);
        list[47] = new Book("Cold Comfort Farm", "Stella Gibbons", 1932);
        list[48] = new Book("Sense and Sensibility", "Jane Austen", 1811);
        list[49] = new Book("A Suitable Boy", "Vikram Seth", 1993);
        list[50] = new Book("The Shadow of the Wind", "Carlos Ruiz Zafon", 2001);
        list[51] = new Book("A Tale Of Two Cities", "Charles Dickens", 1859);
        list[52] = new Book("Brave New World", "Aldous Huxley", 1932);
        list[53] = new Book("The Curious Incident of the Dog in the Night-time", "Mark Haddon", 2003);
        list[54] = new Book("Love In The Time Of Cholera", "Gabriel Garcia Marquez", 1985);
        list[55] = new Book("Of Mice and Men", "John Steinbeck", 1937);
        list[56] = new Book("Lolita", "Vladimir Nabokov", 1955);
        list[57] = new Book("The Secret History", "Donna Tartt", 1992);
        list[58] = new Book("The Lovely Bones", "Alice Sebold", 2002);
        list[59] = new Book("Count of Monte Cristo", "Alexandre Dumas", 1844);
        list[60] = new Book("On the Road", "Jack Kerouac", 1957);
        list[61] = new Book("Jude the Obscure", "Thomas Hardy", 1895);
        list[62] = new Book("Bridget Jones’s Diary", "Helen Fielding", 1996);
        list[63] = new Book("Midnight’s Children", "Salman Rushdie", 1981);
        list[64] = new Book("Moby Dick", "Herman Melville", 1851);
        list[65] = new Book("Oliver Twist", "Charles Dickens", 1837);
        list[66] = new Book("Dracula", "Bram Stoker", 1897);
        list[67] = new Book("The Secret Garden", "Frances Hodgson Burnett", 1911);
        list[68] = new Book("Notes From A Small Island", "Bill Bryson", 1995);
        list[69] = new Book("Ulysses", "James Joyce", 1922);
        list[70] = new Book("The Inferno", "Dante Alighieri", 1317);
        list[71] = new Book("Swallows and Amazons", "Arthur Ransome", 1930);
        list[72] = new Book("Germinal", "Emile Zola", 1930);
        list[73] = new Book("Vanity Fair", "William Makepeace Thackeray", 1847);
        list[74] = new Book("Possession", "AS Byatt", 1990);
        list[75] = new Book("A Christmas Carol", "Charles Dickens", 1843);
        list[76] = new Book("Cloud Atlas", "David Mitchell", 2004);
        list[77] = new Book("The Color Purple", "Alice Walker", 1982);
        list[78] = new Book("The Remains of the Day", "Kazuo Ishiguro", 1989);
        list[79] = new Book("Madame Bovary", "Gustave Flaubert", 1856);
        list[80] = new Book("A Fine Balance", "Rohinton Mistry", 1995);
        list[81] = new Book("Charlotte’s Web", "E.B. White", 1952);
        list[82] = new Book("The Five People You Meet In Heaven", "Mitch Albom", 2003);
        list[83] = new Book("Adventures of Sherlock Holmes", "Sir Arthur Conan Doyle", 1892);
        list[84] = new Book("The Faraway Tree Collection", "Enid Blyton", 2002);
        list[85] = new Book("Heart of Darkness", "Joseph Conrad", 1899);
        list[86] = new Book("The Little Prince", "Antoine De Saint-Exupery", 1943);
        list[87] = new Book("The Wasp Factory", "Iain Banks", 1984);
        list[88] = new Book("Watership Down", "Richard Adams", 1972);
        list[89] = new Book("A Confederacy of Dunces", "John Kennedy Toole", 1980);
        list[90] = new Book("A Town Like Alice", "Nevil Shute", 1950);
        list[91] = new Book("The Three Musketeers", "Alexandre Dumas", 1844);
        list[92] = new Book("Hamlet", "William Shakespeare", 1603);
        list[93] = new Book("Charlie and the Chocolate Factory", "Roald Dahl", 1964);
        list[94] = new Book("Les Miserables", "Victor Hugo", 1862);
   }



    public String getAllTitlesString()
    {
        String result = "all titles list\n";
        for (int i=0; i<list.length; i++)
        {
            //System.out.println(i+".  "+thePerson[i].toString());
            result += list[i].getTitle() + "\n";
        }
        return result;
    }
    
    public String checkTitle(String t){
        Boolean isThere = false;
        
        for(Integer i = 0; i < list.length; i++){
            if(t.equals(list[i].getTitle())){
                isThere = true;
            }
        }
        
        if(isThere == true){
            return "There is a book with the title \"" + t + "\".";
        }
        else{
            return "There is NOT a book with the title \"" + t + "\".";
        }
    }
    
    public Integer booksByAuthor(String a){
        Integer number = 0;
        
        for(Integer i = 0; i < list.length; i++){
            if(a.equals(list[i].getAuthor())){
                number++;
            }
        }
        
        return number;
    }
    
    public void booksByDecade(Integer y){
        Integer remainder = y % 10;
        Integer startDecade = y - remainder;
        
        System.out.println("The following books were written in the " + startDecade + "s:");
        
        for(Integer d = startDecade; d < startDecade+10; d++){
            for(Integer i = 0; i < list.length; i++){
                if(d == list[i].getYear()){
                    System.out.println("    " + list[i].getTitle());
                }
            }
        }
    }
    
    public String getAllTitlesAfter(int year)
    {
        String result = "all titles after "+year+"\n";
        for (int i=0; i<list.length; i++)
        {
            if (list[i].getYear() > year)
            {
                result += list[i].getTitle()+" --- "+list[i].getYear()+"\n";
            }
        }
        return result;
        
    }
    
    public Book getBook(int index)
    {
        if (index < 0 || index >= list.length)
        {
            return null;
        }else
        {
            return list[index];
        }
    }
    
    public int getNumBooks()
    {
        return list.length;
    }
    
    public String toString()
    {
        String result = "MultiBook has "+list.length+" books\n";
        for (int i=0; i<list.length; i++)
        {
            //System.out.println(i+".  "+thePerson[i].toString());
            result += "list["+i+"]     "+list[i].toString() + "\n";
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println("test code for MultiBook class");
        
        MultiBook multiBook = new MultiBook();
        System.out.println("multiBook.toString()       \n"+multiBook.toString() ); 
        System.out.println("multiBook.getAllTitlesString()      \n"+multiBook.getAllTitlesString() ); 
        System.out.println("multiBook.getAllTitlesAfter(2010)      \n"+multiBook.getAllTitlesAfter(2000) );
        
        System.out.println("multiBook.getNumBooks()       "+multiBook.getNumBooks() ); 
        
        System.out.println();
        
        Book theBook = multiBook.getBook(23);
        System.out.println("theBook.toString()       "+theBook.toString() ); 
        
        System.out.println();
        
        System.out.println("multiBook.checkTitle(\"Superman\")       " + multiBook.checkTitle("Superman") ); 
        System.out.println("multiBook.checkTitle(\"The Lord of the Rings\")       " + multiBook.checkTitle("The Lord of the Rings") );
        
        System.out.println();
        
        System.out.println("JRR Tolkien wrote " + multiBook.booksByAuthor("JRR Tolkien") + " book(s).");
        
        System.out.println();
        
        multiBook.booksByDecade(1946);
        multiBook.booksByDecade(1899);
//        
//        if (multiBook.isThereBookWithTitle("The Great Gatsby"))
//        {
//            theBook = multiBook.getBookWithTitle("The Great Gatsby");
//            System.out.println("'The Great Gatsby' was published in the year      "+theBook.getYear() ); 
//
//        }
//        
//        //and another way to do essentially the same thing as the preceeding 'if' statement
//        theBook = multiBook.getBookWithTitle("The Great Gatsby");
//        if (theBook != null)
//        {
//            System.out.println("'The Great Gatsby' was published in the year      "+theBook.getYear() ); 
//        }
//        
//        int num = multiBook.howManyBooksByAuthor("Jane Austen");
//        System.out.println("multiBook.howManyBooksByAuthor(\"Jane Austen\")       "+num ); 
//     
//        num = multiBook.howManyBooksHaveTitleThatContainsTheSubstring("Murder");
//        System.out.println("multiBook.howManyBooksHaveTitleThatContainsTheSubstring(\"Murder\")       "+num ); 
//        
//        num = multiBook.howManyBooksHaveTitleThatContainsTheSubstring("and");
//        System.out.println("multiBook.howManyBooksHaveTitleThatContainsTheSubstring(\"and\")       "+num );
//        
//        num = multiBook.howManyBooksHaveTitleThatContainsTheSubstring("a");
//        System.out.println("multiBook.howManyBooksHaveTitleThatContainsTheSubstring(\"a\")       "+num );
//        
//        num = multiBook.howManyBooksFromOneYearToAnother(1950, 1980);
//        System.out.println("multiBook.howManyBooksFromOneYearToAnother(1950, 1980)       "+num );
//        
//        num = multiBook.howManyBooksFromOneYearToAnother(1980, 1989);
//        System.out.println("multiBook.howManyBooksFromOneYearToAnother(1980, 1989)       "+num );
//        
//        
//        System.out.println("multiBook.getOldestBook().toString()       "+multiBook.getOldestBook().toString() );
//        
//        int theIndex = multiBook.getIndexOfOldestBook();
//        System.out.println("multiBook.getIndexOfOldestBook()       "+num );
//        
//        System.out.println("multiBook.getNewestBook().toString()       "+multiBook.getNewestBook().toString() );
//        
//        theIndex = multiBook.getIndexOfNewestBook();
//        System.out.println("multiBook.getIndexOfNewestBook()       "+num );
//        
//        String shortestAuthorName = multiBook.getShortestAuthorName();
//        System.out.println("shortestAuthorName       "+shortestAuthorName );
//        
//        String longestBookTitle = multiBook.getLongestBookTitle();
//        System.out.println("longestBookTitle       "+longestBookTitle );
//                
//        
//        multiBook.sortAscendingByYear();
//        System.out.println("multiBook.toString() after multiBook.sortAscendingByYear()       \n"+multiBook.toString() ); 
//        
//        
        
     
    }
    
    
}

