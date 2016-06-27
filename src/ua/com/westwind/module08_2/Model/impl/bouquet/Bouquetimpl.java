package ua.com.westwind.module08_2.Model.impl.bouquet;

import ua.com.westwind.module08_2.Model.impl.Bouquet;

public class BouquetImpl implements Bouquet {
    private String name;
    private String color;
    private String type;

    public  BouquetImpl(){
    }
    public BouquetImpl(String name, String color, String type){
        this.name = name;
        this.color = color;
        this.type = type;
    }
}
