package view;

import controller.BuyerController;
import controller.SellerController;
import model.UserAccount;

import javax.swing.*;

public class SellerWindow extends JFrame {

    SellerController sellerController;
    public SellerWindow(SellerController sellerController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnCatalog = new JButton("Каталог");
        btnCatalog.addActionListener(e ->{});

        JButton btnAddProduct = new JButton("Добавление товара");
        btnAddProduct.addActionListener(e ->{});

        JButton btnCancel = new JButton("Назад");
        btnCancel.addActionListener(e ->{});

        JLabel lblSellerName = new JLabel("Имя продавца");
        JLabel lblPhoneNumber = new JLabel("Телефон");

        this.sellerController = sellerController;
        this.add(btnCatalog);
        this.add(btnAddProduct);
        this.add(btnCancel);
        this.add(lblSellerName);
        this.add(lblPhoneNumber);
    }

}
