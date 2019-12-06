package Model;
import java.util.*;

public class ItemContainer
{
    private ArrayList<ItemDescriptor> items;
    
    public ItemContainer()
    {
        items = new ArrayList<>();
    }

    public void add(ItemDescriptor item)
    {
        items.add(item);
    }
    public void remove(ItemDescriptor item)
    {
        items.remove(item);
    }
    public ArrayList<ItemDescriptor> read()
    {
        return items;
    }
}
