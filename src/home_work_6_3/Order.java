package home_work_6_3;

import java.util.Date;

public class Order {
    private long orderId;
    private Customer customer;
    private Employee employee;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private int shipVia;
    private String freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;

    public Order(long orderId,
                 Customer customer,
                 Employee employee,
                 Date orderDate,
                 Date requiredDate,
                 Date shippedDate,
                 int shipVia,
                 String freight,
                 String shipName,
                 String shipAddress,
                 String shipCity,
                 String shipRegion,
                 String shipPostalCode,
                 String shipCountry) {
        this.orderId = orderId;
        this.customer = customer;
        this.employee = employee;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
    }
}
