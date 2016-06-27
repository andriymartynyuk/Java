package ua.com.westwind.module08_2.Model.impl.bouquet;

import ua.com.westwind.module08_2.Model.Bouquet;

public class BouquetImpl implements Bouquet {
    private String name;
    private String color;
    private int price;

    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public Integer getPrice(){
        return price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void setPrice(int price) {
        this.price = price;
    }
}
