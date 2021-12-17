package model;

import java.awt.*;
import java.text.DecimalFormat;

public class Product {
    public Product(String nameProduct, String categoryProduct, String descriptionProduct, DecimalFormat priceProduct,
                   Image pictureProduct){
        this.nameProduct = nameProduct;
        this.categoryProduct = categoryProduct;
        this.descriptionProduct = descriptionProduct;
        this.priceProduct = priceProduct;
        this.pictureProduct = pictureProduct;
    }

    public String nameProduct;
    public String categoryProduct;
    public String descriptionProduct;
    public DecimalFormat priceProduct;
    public Image pictureProduct;

    public Product() {

    }

    public String getNameProduct() { return nameProduct; }
    public String getCategoryProduct() {return categoryProduct; }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public DecimalFormat getPriceProduct() {
        return priceProduct;
    }

    public Image getPictureProduct() {
        return pictureProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public void setPriceProduct(DecimalFormat priceProduct) {
        this.priceProduct = priceProduct;
    }

    public void setPictureProduct(Image pictureProduct) {
        this.pictureProduct = pictureProduct;
    }
}
