package ua.com.westwind.module08_2.Model.impl;

import ua.com.westwind.module08_2.Model.Bouquet;

import java.util.Set;

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

<<<<<<< HEAD:src/ua/com/westwind/module08_2/Model/impl/bouquet/BouquetImpl.java
    public Set<Bouquet> getBouquetInternal(){
        if(this.)
    }
=======
>>>>>>> 27e5edd0a3e40b60e3786e493e726bc262d84e48:src/ua/com/westwind/module08_2/Model/impl/BouquetImpl.java

}

