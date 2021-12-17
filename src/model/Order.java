package model;

import java.text.DecimalFormat;
import java.util.List;

public class Order {

    public Order(String numberOrder, String statusOrder, DecimalFormat priceOrder, List<Product> products) {
        this.numberOrder = numberOrder;
        this.statusOrder = statusOrder;
        this.priceOrder = priceOrder;
        this.products = products;
    }

    public String numberOrder;
    public String statusOrder;
    public DecimalFormat priceOrder;
    public List<Product> products;

    public Order() {

    }

    public String getNumberOrder() {
        return numberOrder;
    }

    public String getStatusOrder() {
        return statusOrder;
    }

    public DecimalFormat getPriceOrder() {
        return priceOrder;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder = statusOrder;
    }

    public void setPriceOrder(DecimalFormat priceOrder) {
        this.priceOrder = priceOrder;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
