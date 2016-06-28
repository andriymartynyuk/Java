package ua.com.westwind.module08_2.Controller;

import ua.com.westwind.module08_2.Model.Bouquet;
import ua.com.westwind.module08_2.Model.impl.bouquet.BouquetImpl;


public class ControllerBouquet {
          // поміщаєм в контроллер Bouquet в змінну boquet
    public Bouquet bouquet;
          //  Для метода ControllerBouquet урівнюєм змінні, задаєм this
    public ControllerBouquet(Bouquet bouquet) {
        this.bouquet = bouquet;
    }
         // Метод класу Bouquet який повертає змінну bouquet
    public Bouquet getBouquet() {
        return bouquet;
    }
         // Метод класу Bouquet який задає змінну bouquet
    public void setBouquet(Bouquet bouquet) {
        this.bouquet = bouquet;
    }



<<<<<<< HEAD
    public void addFlower (Bouquet bouquet) { this.bouquet.getBouquetInternal().add(bouquet);}
=======
    public void addFlower(){}

    public void showBoquet(){}
>>>>>>> 27e5edd0a3e40b60e3786e493e726bc262d84e48
}






