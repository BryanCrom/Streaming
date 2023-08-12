/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Running running = new Running();
        Wallet wallet = new Wallet("Bryan Crombach", "24-7295-6285025-08", 100000.00);
        Product p1 = new Movie(20.59, "Fight Club", "David Fincher", 2.31);
        Product p2 = new Movie(39.99, "The Black Phone", "Scott Derrickson", 1.7);
        Product p3 = new Movie(9.49, "The Good, The Bad And The Ugly", "Sergio Leone", 2.68);
        Product p4 = new Book(4.99, "Goosebumps: Night Of The Living Dummy", "R. L. Stine", 160);
        Product p5 = new Book(16.00, "The Hobbit", "J. R. R. Tolkien", 304);
        Product p6 = new Book(29.99, "Fairy Tale", "Stephen King", 608);
        Product p7 = new VideoGame(17.99, "Hollow Knight", "Team Cherry", 25);
        Product p8 = new VideoGame(24.79, "Return Of The Obra Dinn", "Lucas Pope", 9);
        Product p9 = new VideoGame(40.18, "Resident Evil 7: Biohazard", "CAPCOM", 14);
        Store store = new Store();
        Library library = new Library();
        store.add(p1);
        store.add(p2);
        store.add(p3);
        store.add(p4);
        store.add(p5);
        store.add(p6);
        store.add(p7);
        store.add(p8);
        store.add(p9);
        
        boolean quit = false;
        while(quit == false)
        {
            
            System.out.println();
            System.out.println("\nWELCOME TO THE ENTERTAINMENT INC. STORE AND PLAYER\n1. Display Store\n2. Display your Library\n3. Add funds to your Wallet\n4. Quit Program");
            try
            {
                int choice = scan.nextInt();
                scan.nextLine();
                if(choice != 1 && choice != 2 && choice != 3 && choice != 4)
                {
                    System.out.println("Not an applicable number");
                }
                switch(choice)
                {
                    case 1:
                        try
                        {
                            System.out.println();
                            store.writeTxt();
                            store.printTxt();
                            System.out.println("Please enter the number of the product you would like to purchase or enter 10 to return to menu");
                            int purchase = scan.nextInt();
                            scan.nextLine();
                            if(purchase < 10 && purchase > 0)
                            {
                                purchase--;
                                if(wallet.purchased(store.get(purchase).getPrice()) == true)
                                {
                                    wallet.purchased(store.get(purchase).getPrice());
                                    library.add(store.get(purchase));
                                    store.purchase(purchase);
                                    break;
                                }
                                else
                                    break;
                            }
                            else if(purchase == 10)
                                break;
                            else
                            {
                                System.out.println("Not an applicable number");
                                break;
                            }
                        }
                        catch(InputMismatchException | IndexOutOfBoundsException e)
                        {
                        System.out.println("Invalid Input");
                        break;
                        }                  
                    case 2:
                        try
                        {   
                            System.out.println();
                            library.writeTxt();
                            library.printTxt();
                            System.out.println("Please enter the number of the product you would like to play or enter 10 to return to menu");
                            int product = scan.nextInt();
                            scan.nextLine();
                            if(product < 10 && product > 0)
                            {
                                product--;
                                running.run(library.get(product));
                                running.getRunning();
                                System.out.println("Press any key to quit running this product");
                                try
                                {
                                    System.in.read();
                                }  
                                catch(IOException e)
                                {} 
                                running.quit();
                                scan.nextLine();
                                break;
                            }
                            else if(product == 10)
                            {
                                scan.nextLine();
                                break;
                            }
                            else
                            {
                                System.out.println("Not an applicable number");
                                scan.nextLine();
                                break;
                            }
                        }
                        catch(InputMismatchException | IndexOutOfBoundsException e)
                        {
                        System.out.println("Invalid Input");
                        scan.nextLine();
                        break;
                        }
                    case 3:
                        try
                        {
                            System.out.println();
                            wallet.writeTxt();
                            wallet.printTxt();
                            System.out.println("Please enter the amount you would like to add to your online wallet:");
                            double deposit = scan.nextDouble();
                            scan.nextLine();
                            wallet.deposited(deposit);
                            break;
                        }
                        catch(InputMismatchException | IndexOutOfBoundsException e)
                        {
                            System.out.println("Invalid Input");
                            break;
                        }
                    case 4:
                        System.out.println("Thank you for using Entertainment INC.");
                        quit = true;
                        break;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid Input");
            }
        }
        scan.close();
    }
    
}
