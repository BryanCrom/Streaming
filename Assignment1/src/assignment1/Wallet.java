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

public class Wallet 
{
    private String name;
    private String account;
    private double balance;
    
    public Wallet(String name, String account, double balance)
    {
        this.setName(name);
        this.setAccount(account);
        this.setBalance(balance);
    }
    
    private void setName(String name)
    {
        this.name = name;
    }
    
    private void setAccount(String account)
    {
        this.account = account;
    }
        
    private void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getAccount()
    {
        return this.account;
    }
        
    public double getBalance()
    {
        return this.balance;
    }
    
    public boolean purchased(double price)
    {
        if(price > this.balance)
        {
            System.out.println("Your funds are too low!\nYou cannot afford this product");
            return false;
        }
        else
        {
            setBalance(this.balance - price);
            return true;
        }
    }
    
    public void deposited(double deposit)
    {
        if(deposit > 0)
        {
            this.balance = this.balance + deposit;
        }
        else if(deposit == 0)
        {
            System.out.println("Invalid amount");
        }
        else
        {
            System.out.println("Cannot withdraw money from wallet");
        }
    }
    
    @Override
    public String toString()
    {
        return this.name + "\n" + this.account + "\n$" + this.balance;
    }
    
    public void writeTxt()
    {
        PrintWriter pw;
        try
        {
            pw = new PrintWriter(new FileOutputStream("Wallet.txt"));
            pw.append(toString());
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
            br = new BufferedReader(new FileReader("Wallet.txt"));
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
            System.out.println("Error reading file Wallet.txt");
        }
    }
}
