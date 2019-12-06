package UI;
import Control.*;

/**
 * Write a description of class DVDMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductUI
{
    private ItemController ItemCtr;
    /**
     * Constructor for objects of class DVDMenu
     */
    public ProductUI()
    {
        ItemCtr = new ItemController();
    }

    public void start() {
        boolean exit=false;
        while (!exit) {
            int choice = writeProductUI();
            if(choice == 1) {
                /*addDVD();  
                dvdCtr.saveData();*/
                System.out.println("In add product");
            }
            else if(choice == 2) { 
                /*manageDVD();
                dvdCtr.saveData();*/
                System.out.println("In add package");
            }
            else if(choice == 3) {
                /*removeDVD(); 
                dvdCtr.saveData();*/
                System.out.println("In add copy");
            }
            else if(choice == 4) {
                /*showAll();*/
                System.out.println("In remove item");
            }
            else if(choice == 5) {
                /*showAll();*/
                System.out.println("In remove copy");
            }
            else if(choice == 6) {
                /*showAll();*/
                System.out.println("In print all");
            }
            else {
                
                exit = true;
            }//end else
        }//end while
    }
    
    private int writeProductUI()
    {
        TextOptions menu = new TextOptions("\n ***Product menu***", "Go back to the Main Menu");
        menu.addOption("Add Product");
        menu.addOption("Add Package");
        menu.addOption("Add Copy");
        menu.addOption("Remove Item");
        menu.addOption("Remove Copy");
        menu.addOption("Print All Items");
        return menu.prompt();
    }
    
    /*private void addDVD()
    {
        TextOptions text;
        text = new TextOptions("", "");
        System.out.println("Please fill out the next fields:");
        String title;
        title = text.inputString("Title");
        String artist;
        artist = text.inputString("Artist");
        String genre ;
        genre = text.inputString("Genre");
        int publicationDate;
        publicationDate = text.inputNumber("Publication Date");
        long barcode;
        barcode = text.inputNumber("Barcode");
        dvdCtr.addDVD(title, artist, genre, publicationDate, barcode);
        System.out.println("DVD has been added.");
    }
    
    private void manageDVD()
    {
        TextOptions text;
        text = new TextOptions("", "");
        String fullDVD;
        String title;
        title = text.inputString("Enter the name of the DVD");
        dvdCtr.manageDVD(title);
    }
    
    private void removeDVD()
    {
        TextOptions text;
        text = new TextOptions("", "");
        String message;
        String title;
        title = text.inputString("Enter the name of the DVD");
        message = dvdCtr.removeDVD(title);
        System.out.println(message);
    }
    
    private void showAll()
    {
        dvdCtr.showAll();
    }*/
    
}
