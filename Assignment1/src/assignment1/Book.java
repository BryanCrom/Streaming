package assignment1;

public class Book extends Product
{
    private String author;
    private int pages;
    
    public Book(double price, String name, String author, int pages)
    {
        super(price,name);
        this.setAuthor(author);
        this.setPages(pages);
    }
    
    private void setAuthor(String author)
    {
        this.author = author;
    }
    
    private void setPages(int pages)
    {
        this.pages = pages;
    }
    
    public String getAuthor()
    {
        return this.author;
    }
    
    public int getPages()
    {
        return this.pages;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " written by " + this.author + " this book has " + this.pages + " pages";
    }
}
