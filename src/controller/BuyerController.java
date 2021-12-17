package controller;

import model.Order;
import model.Product;
import java.util.List;

public class BuyerController {

    public List<Product> getFavorites(){
        return null;
    }

    public List<Order> getOrders(){
        return null;
    }

    public List<Product> getBasket(){
        return null;
    }

    public boolean saveOrder(Order order){
        return true;
    }

    public boolean addToFavorite(Product product){
        return true;
    }

    public boolean addToBasket(Product product){
        return true;
    }

    public boolean deleteFromFavorite(Product product){
        return true;
    }

    public  boolean deleteFromBasket(Product product){
        return true;
    }
}
