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

public class Library 
{
    private ArrayList<Product> library;
    
    public Library()
    {
        this.library = new ArrayList<>();
    }
    
    public void add(Product item)
    {
        if(item != null)
            this.library.add(item);
    }
    
    public Product get(int index)
    {
        return this.library.get(index);
    }
    
    public void writeTxt()
    {
        PrintWriter pw;
        try
        {
            pw = new PrintWriter(new FileOutputStream("Library.txt"));
            for(int i = 0; i < this.library.size(); i++)
            {
                pw.append((i + 1) + ": " + this.library.get(i).toString() + "\n");
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
            br = new BufferedReader(new FileReader("Library.txt"));
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
            System.out.println("Error reading file Library.txt");
        }
    }
}

