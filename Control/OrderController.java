package Control;
import Model.*;

/**
 * Write a description of class OrderController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderController
{
    private OrderContainer oCon;
    private CustomerContainer cCon;
    public boolean createOrder(String customerID, String orderedDate, String deliveryDate, String status, String shipped)
    {
        Private customer = cCon.getCustomer(customerID);
        //customerRole
        CustomerOrder c = new CustomerOrder(orderedDate, deliveryDate, 0,  )
    }
    
    public GenericOrder findOrder(int orderID)
    {
        
    }
 (String orderedDate, String deliveryDate, double totalPrice, EmployeeRole employee, String status, CustomerRole customer)
    {
}
