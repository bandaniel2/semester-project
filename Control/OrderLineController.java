package Control;

import java.util.ArrayList;
import Model.*;



public class OrderLineController
{

    public OrderLineController()
    {
    }

    public boolean addOrderLine(int orderId, String barcode, int quantity)
    {
        OrderController oCtr = new OrderController();
        Order order = orderCtr.getOrder(orderId);
        if (order == null)
        {
            return false;
            // This should not happen if we had chosen an existing order
        }
        
        // Get the relevant itemdescriptor: Cooperation with the itemdescriptor controller
        ItemController iCtr = new ItemController();
        ItemDescriptor item =iCtr.getItem(barcode);
        if (item == null)
        {
            return false;
        }
        // Create new suborder and link it to the found item descriptor
        OrderLine ol= new OrderLine(quantity, item);
        // Insert this suborder in the found order
        return order.addOrderLine(ol);
    }
    
    public boolean addCopyOrderLine(int orderId, String barcode)
    {
        OrderController oCtr = new OrderController();
        Order order = orderCtr.getOrder(orderId);
        if (order == null)
        {
            return false;
            // This should not happen if we had chosen an existing order
        }
        
        // Get the relevant itemdescriptor: Cooperation with the itemdescriptor controller
        ItemController iCtr = new ItemController();
        Copy copy = iCtr.getCopy(barcode);
        if (copy == null)
        {
            return false;
        }
        // Create new suborder and link it to the found item descriptor
        OrderLineOfCopy oc= new OrderLineOfCopy(copy);
        // Insert this suborder in the found order
        return order.addCopyOrderLine(oc);
    }
    
    
    
    
    
    
}


