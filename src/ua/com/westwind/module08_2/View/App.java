package ua.com.westwind.module08_2.View;
import ua.com.westwind.module08_2.Controller.ControllerBouquet;
import ua.com.westwind.module08_2.Controller.ControllerFileExtension;
import ua.com.westwind.module08_2.Controller.ControllerMusicShop;
import ua.com.westwind.module08_2.Model.impl.bouquet.BouquetImpl;
import ua.com.westwind.module08_2.Model.impl.fileExtension.FileExtensionImpl;
import ua.com.westwind.module08_2.Model.impl.musicShop.MusicShopImpl;

public class App {
    public static void main(String[] args) {

        ControllerBouquet controllerBouquet = new ControllerBouquet(new BouquetImpl("Boquet");
        controllerBouquet.addFlower( new BouquetImpl("Aster", "white", 25));
        controllerBouquet.addFlower( new BouquetImpl("Tulip", "red", 30));
        controllerBouquet.addFlower( new BouquetImpl("Rose", "yellow", 40));
        controllerBouquet.showBoquet();

        ControllerFileExtension controllerFileExtension = new ControllerFileExtension(new FileExtensionImpl("FileExtentions"));
        controllerFileExtension.addExtention( new FileExtensionImpl("TextFile", ".txt", 25));
        controllerFileExtension.addExtention( new FileExtensionImpl("ImageFile", ".png", 30));
        controllerFileExtension.addExtention( new FileExtensionImpl("AudiFile", "jpg", 40));
        controllerFileExtension.showExtentions();

        ControllerMusicShop controllerMusicShop = new ControllerMusicShop(new MusicShopImpl("MusicShop"));
        controllerMusicShop.addInstrument( new BouquetImpl("Guitar", "new", 25));
        controllerMusicShop.addInstrument( new BouquetImpl("Piano", "new", 30));
        controllerMusicShop.addInstrument( new BouquetImpl("Trumplet", "old", 40));
        controllerMusicShop.showInstruments();

    }
}
