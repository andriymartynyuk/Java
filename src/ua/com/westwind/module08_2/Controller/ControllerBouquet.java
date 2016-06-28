package ua.com.westwind.module08_2.Controller;

import ua.com.westwind.module08_2.Model.Bouquet;
import ua.com.westwind.module08_2.Model.impl.bouquet.BouquetImpl;

public class ControllerBouquet {
    public Bouquet bouquet;

    public ControllerBouquet(Bouquet bouquet){ this.bouquet = bouquet; }

    public Bouquet getBouquet(){ return bouquet; }

    public void setBouquet(Bouquet bouquet) { this.bouquet = bouquet; }

    public void addFlower (Bouquet bouquet) { this.bouquet.getBouquetInternal().add(bouquet);}
}
