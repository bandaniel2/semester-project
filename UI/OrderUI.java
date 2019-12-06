package UI;


/**
 * Write a description of class OrderUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderUI
{
    // instance variables - replace the example below with your own
    OrderController oCon = nwe OrderController();
    
    public void start() {
        boolean exit=false;
        while (!exit) {
            int choice = writeOrderUI();
            if(choice == 1) {
                
                System.out.println("In add product");
            }
            else if(choice == 2) { 
                
                System.out.println("In add package");
            }
            else if(choice == 3) {
                
                System.out.println("In add copy");
            }
            
            else {
                
                exit = true;
            }
        }
    }
    
    private int writeOrderUI()
    {
        TextOptions menu = new TextOptions("\n ***Order menu***", "Go back to the Main Menu");
        menu.addOption("Add Order");
        menu.addOption("Add OrderLine");
        menu.addOption("Add OrderLineOfCopy");
        return menu.prompt();
    }
}

