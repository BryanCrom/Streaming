/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

abstract public class Product
{
    protected double price;
    protected String name;
    
    public Product(double price, String name)
    {
        this.setPrice(price);
        this.setName(name);
    }
    
    private void setPrice(double price)
    {
        this.price = price;
    }
    
    private void setName(String name)
    {
        this.name = name;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    @Override
    public String toString()
    {
        return "$" + this.price + " for " + this.name;
    }
}
