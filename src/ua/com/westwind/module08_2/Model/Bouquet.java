package ua.com.westwind.module08_2.Model;

import ua.com.westwind.module08_2.Model.impl.bouquet.BouquetImpl;

import java.util.Set;

public interface Bouquet {

    public String getName();

    public String getColor();

    public Integer getPrice();

    public void setName(String name);

    public void setColor(String color);

    public void setPrice(int price);

    public void addFlower(Set<BouquetImpl> String);
}
