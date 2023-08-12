/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

public class Movie extends Product
{
    private String director;
    private double runTime;
    
    public Movie(double price, String name, String director, double runTime)
    {
        super(price,name);
        this.setDirector(director);
        this.setRunTime(runTime);
    }
    
    private void setDirector(String director)
    {
        this.director = director;
    }
    
    private void setRunTime(double runTime)
    {
        this.runTime = runTime;
    }
    
    public String getDirector()
    {
        return this.director;
    }
    
    public double getRunTime()
    {
        return this.runTime;
    }
    
    public int minutes(double runTime)
    {
        int minutes;
        minutes = (int) ((runTime - (int)runTime) * 60);
        return minutes;
    }
    
    public int hours(double runTime)
    {
        int hours = (int)runTime;
        return hours;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " directed by " + this.director + " the run time is " + hours(this.runTime) + " hours and " + minutes(this.runTime) + " minutes";
    }
}
