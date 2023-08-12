/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

public class Running implements Play
{
    private Product running;
    
    public Running()
    {
        this.running = null;
    }
    
    @Override
    public void getRunning()
    {
        if(this.running != null)
            System.out.println(this.running + " is currently running");
        else
            System.out.println("Nothing is currently running");
    }
    
    @Override
    public void quit()
    {
        this.running = null;
    }
    
    @Override
    public void run(Product run)
    {
        this.running = run;
    }
}
