package assignment1;

public class VideoGame extends Product
{
    private String developer;
    private int gameLength;
    
    public VideoGame(double price, String name, String developer, int gameLength)
    {
        super(price, name);
        this.setDeveloper(developer);
        this.setGameLength(gameLength);
    }
    
    private void setDeveloper(String developer)
    {
        this.developer = developer;
    }
    
    private void setGameLength(int gameLength)
    {
        this.gameLength = gameLength;
    }
    
    public String getDeveloper()
    {
        return this.developer;
    }
    
    public int getGameLength()
    {
        return this.gameLength;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " developed by " + this.developer + " the average play length is " + this.gameLength + " hours";
    }
}
