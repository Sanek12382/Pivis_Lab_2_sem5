package model;

import java.awt.*;

public class Review {

    public Review(String loginUser, String nameProduct, String textReview, Image pictureReview, int raringReview) {
        this.loginUser = loginUser;
        this.nameProduct = nameProduct;
        this.textReview = textReview;
        this.pictureReview = pictureReview;
        this.raringReview = raringReview;
    }

    public String loginUser;
    public String nameProduct;
    public String textReview;
    public Image pictureReview;
    public int raringReview;

    public Review() {

    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getTextReview() {
        return textReview;
    }

    public void setTextReview(String textReview) {
        this.textReview = textReview;
    }

    public Image getPictureReview() {
        return pictureReview;
    }

    public void setPictureReview(Image pictureReview) {
        this.pictureReview = pictureReview;
    }

    public int getRaringReview() {
        return raringReview;
    }

    public void setRaringReview(int raringReview) {
        this.raringReview = raringReview;
    }
}
