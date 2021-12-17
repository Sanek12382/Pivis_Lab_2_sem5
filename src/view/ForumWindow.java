package view;

import controller.ForumController;
import controller.RegistrationController;

import javax.swing.*;

public class ForumWindow extends JFrame{

    ForumController forumController;
    public ForumWindow(ForumController forumController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnAddMessage = new JButton("Добавить сообщение");
        btnAddMessage.addActionListener(e ->{});

        JButton btnDeleteMessage = new JButton("Удалить сообщение");
        btnDeleteMessage.addActionListener(e ->{});

        JButton btnCancel = new JButton("Отмена");
        btnCancel.addActionListener(e ->{});

        this.forumController = forumController;
        this.add(btnAddMessage);
        this.add(btnDeleteMessage);
        this.add(btnCancel);
    }

}