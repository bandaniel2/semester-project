package Model;


public class Copy
{
    private String serialNumber;
    private Product product;
    private Location location;

    public Copy(String serialNumber, Product product)
    {
        this.serialNumber = serialNumber;
        this.product = product;
    }
    
    public String getSerialNumber()
    {
        return serialNumber;
    }
    public Product getProduct()
    {
        return product;
    }
    public Location getLocation()
    {
        return location;
    }
}
