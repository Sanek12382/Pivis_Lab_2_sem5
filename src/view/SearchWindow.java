package view;

import controller.SearchController;

import javax.swing.*;

public class SearchWindow extends JFrame {

    SearchController searchController;
    public SearchWindow(SearchController searchController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JButton btnSearch = new JButton("Найти");
        btnSearch.addActionListener(e ->{});

        JTextField txtSearch = new JTextField("Поиск");

        JButton btnCancel = new JButton("Назад");
        btnCancel.addActionListener(e ->{});

        this.searchController = searchController;
        this.add(btnSearch);
        this.add(txtSearch);
        this.add(btnCancel);

    }
}
