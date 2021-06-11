package com.fnc.thymeleaf.dto;

public class Product {
    private String imageUrl;
    private String name;
    private String price;
    private String seller;


    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSeller() {
        return this.seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "{" +
            " imageUrl='" + getImageUrl() + "'" +
            ", name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", seller='" + getSeller() + "'" +
            "}";
    }

}
