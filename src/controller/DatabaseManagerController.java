package controller;

import model.MessageForum;
import model.Product;
import model.UserAccount;

import java.util.List;

public class DatabaseManagerController {

    public boolean saveUserAccount(UserAccount user){
        return true;
    }

    public boolean deleteUserAccount(UserAccount user){
        return true;
    }

    public List<Product> loadProducts(){
        return null;
    }

    public boolean addProduct(List<Product> product){
        return true;
    }

    public boolean addMessageForum(MessageForum message){
        return true;
    }

    public boolean deleteMessageForum(MessageForum message){
        return true;
    }
}
