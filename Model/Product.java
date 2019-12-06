package Model;


public class Product extends ItemDescriptor
{
    private int categoryID;
    private int minStock;
    private int maxStock;
    private double recommendedRetailPrice;
    private double tradeAllowance;
    private double costPrice;
    private double sellingPrice;
    private boolean isUnique;
    private LocationLine atDIY;
    private LocationLine atTimber;
    
    public Product(String barcode, String name, int id, int min, int max, double rec, double trade, double cost, double sell)
    {
        super(barcode, name);
        categoryID = id;
        minStock = min;
        maxStock = max;
        recommendedRetailPrice = rec;
        tradeAllowance = trade;
        costPrice = cost;
        sellingPrice = sell;
    }
    
    public int getCategoryID()
    {
        return categoryID;
    }
    public int getMinStock()
    {
        return minStock;
    }
    public int getMaxStock()
    {
        return maxStock;
    }
    public double getRecommendedRetailPrice()
    {
        return recommendedRetailPrice;
    }
    public double getTradeAllowance()
    {
        return tradeAllowance;
    }
    public double getCostPrice()
    {
        return costPrice;
    }
    public boolean isUnique()
    {
        return isUnique;
    }
    public void setCategoryID(int categoryID)
    {
        this.categoryID = categoryID;
    } 
    public void setMinStock(int minStock)
    {
        this.minStock = minStock;
    } 
    public void setMaxStock(int maxStock)
    {
        this.maxStock = maxStock;
    } 
    public void setRecommendedRetailPrice(double recommendedRetailPrice)
    {
        this.recommendedRetailPrice = recommendedRetailPrice;
    } 
    public void setTradeAllowance(double tradeAllowance)
    {
        this.tradeAllowance = tradeAllowance;
    } 
    public void setCostPrice(double costPrice)
    {
        this.costPrice = costPrice;
    }
    public void makeUnique(boolean unique)
    {
        this.isUnique = unique;
    }
    public void setDIY(LocationLine location)
    {
        this.atDIY = location;
    }
    public void setTimber(LocationLine location)
    {
        this.atTimber = location;
    }
    public double getSellingPrice()
    {
        return sellingPrice;
    }
    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }
    
}
