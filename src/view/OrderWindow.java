package view;

import controller.OrderController;

import javax.swing.*;

public class OrderWindow extends JFrame {

    OrderController orderController;
    public OrderWindow(OrderController orderController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnSearch = new JButton("Оплатить");
        btnSearch.addActionListener(e ->{});

        JLabel lblNumberOrder = new JLabel("Номер заказа");
        JLabel lblPrice = new JLabel("Стоимость");
        JLabel lblStatusOrder = new JLabel("Статус заказа");

        JButton btnCancel = new JButton("Назад");
        btnCancel.addActionListener(e ->{});

        this.orderController = orderController;
        this.add(btnSearch);
        this.add(lblNumberOrder);
        this.add(lblPrice);
        this.add(lblStatusOrder);
        this.add(btnCancel);
    }
}
