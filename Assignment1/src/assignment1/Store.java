/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Store 
{
    private ArrayList<Product> store;
    
    public Store()
    {
        this.store = new ArrayList<>();
    }
    
    public void add(Product item)
    {
        if(item != null)
            this.store.add(item);
    }
    
    public int size()
    {
        return this.store.size();
    }
    
    public ArrayList<Product> getStore()
    {
        return this.store;
    }
    
    public Product get(int index)
    {
        return this.store.get(index);
    }
    
    public void purchase(int index)
    {
        if(index < this.store.size())
        {
            System.out.println("Congrats you have purchased " + this.store.remove(index));
        }
    }
    
    public void writeTxt()
    {
        PrintWriter pw;
        try
        {
            pw = new PrintWriter(new FileOutputStream("Store.txt"));
            for(int i = 0; i < this.store.size(); i++)
            {
                pw.append((i + 1) + ": " + this.store.get(i).toString() + "\n");
            }
            pw.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
    } 
    
    public void printTxt()
    {
        BufferedReader br;
        try
        {
            br = new BufferedReader(new FileReader("Store.txt"));
            String str;
            while((str = br.readLine()) != null)
                System.out.println(str);
            
            br.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println("Error reading file Store.txt");
        }
    }
}
