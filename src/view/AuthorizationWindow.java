package view;

import controller.AccountController;
import controller.RegistrationController;

import javax.swing.*;

public class AuthorizationWindow extends JFrame {


    AccountController accountController;

    public AuthorizationWindow(AccountController accountController){
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnEnter = new JButton("Войти");

        btnEnter.addActionListener(e ->{});

        JTextField txtName = new JFormattedTextField("Имя");
        JTextField txtPass = new JFormattedTextField("Пароль");



        this.accountController = accountController;
        this.add(btnEnter);
        this.add(txtName);
        this.add(txtPass);
    }

}
