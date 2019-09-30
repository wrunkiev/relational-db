package home_work_6_3;

public class OrderDetails {
    private Order order;
    private Product product;
    private float unitPrice;
    private int quantity;
    private int discount;

    public OrderDetails(Order order, Product product, float unitPrice, int quantity, int discount) {
        this.order = order;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }
}
