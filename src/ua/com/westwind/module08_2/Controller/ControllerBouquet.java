package ua.com.westwind.module08_2.Controller;

import ua.com.westwind.module08_2.Model.Bouquet;

public class ControllerBouquet {
    public Bouquet bouquet;

    public ControllerBouquet(Bouquet bouquet){ this.bouquet = bouquet; }

    public Bouquet getBouquet(){ return bouquet; }

    public void setBouquet(Bouquet bouquet) { this.bouquet = bouquet; }


    public void addFlower (){

    }

    public void showBoquet(){
        System.out.println("Bouquet");
    }
}
