package home_work_6_3;

public class Product {
    private long productId;
    private String productName;
    private Supplier supplier;
    private Category category;
    private int quantityPerUnit;
    private float unitPrice;
    private int unitsInStock;
    private int unitsOnOrder;
    private int reorderLevel;
    private int discontinued;

    public Product(long productId,
                   String productName,
                   Supplier supplier,
                   Category category,
                   int quantityPerUnit,
                   float unitPrice,
                   int unitsInStock,
                   int unitsOnOrder,
                   int reorderLevel,
                   int discontinued) {
        this.productId = productId;
        this.productName = productName;
        this.supplier = supplier;
        this.category = category;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
    }
}
