package view;

import controller.ReviewController;
import model.StarRater;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;

public class ReviewWindow extends JFrame {

    ReviewController reviewController;
    public ReviewWindow(ReviewController reviewController){

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JLabel lblProductName = new JLabel("Имя товара");

        JPEGImageReadParam image = new JPEGImageReadParam();

        JTextField txtNameUser = new JTextField("Ваше имя");

        StarRater starRater = new StarRater(5, 2, 1);
        starRater.addStarListener();

        JButton btnCancel = new JButton("Назад");
        btnCancel.addActionListener(e ->{});

        this.reviewController = reviewController;
        this.add(lblProductName);
        this.add(image);
        this.add(txtNameUser);
        this.add(starRater);
        this.add(btnCancel);
    }

    private void add(JPEGImageReadParam image) {
    }
}
