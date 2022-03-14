package com.example.customlistview;

public class Goods {
    private String name;
    private String shopName;
    private int imageGoods;

    public Goods(String name, String shopName, int imageGoods) {
        this.name = name;
        this.shopName = shopName;
        this.imageGoods = imageGoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImageGoods() {
        return imageGoods;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }
}
