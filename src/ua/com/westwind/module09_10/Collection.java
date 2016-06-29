package ua.com.westwind.module09_10;

import java.util.*;
import java.util.List;

public class Collection {
    public void colList() {
        List audioFile = Arrays.asList("AudioFile", ".mp3", "43");
        List textFile = Arrays.asList("TextFile", ".txt", "40");
        List imageFile = Arrays.asList("ImageFile", ".png", "35");

        List<String> fileList = new ArrayList<>();
        fileList.addAll(audioFile);
        fileList.addAll(textFile);
        fileList.addAll(imageFile);

        List asterFlower = Arrays.asList("Aster", "new", "white");
        List tulipFlower = Arrays.asList("Tulip", "old", "red");
        List roseFlower = Arrays.asList("Rose", "new", "yellow");

        List<String> flowerList = new ArrayList<>();
        flowerList.addAll(asterFlower);
        flowerList.addAll(tulipFlower);
        flowerList.addAll(roseFlower);

        List guitarInstrument = Arrays.asList("Guitar", "new", "6");
        List pianoInstrument = Arrays.asList("Piano", "new", "4");
        List trumpletInstrument = Arrays.asList("Trumplet", "old", "5");

        List<String> instrumentList = new ArrayList<>();
        instrumentList.addAll(guitarInstrument);
        instrumentList.addAll(pianoInstrument);
        instrumentList.addAll(trumpletInstrument);

        Map<String, List<String>> mapList = new HashMap<String, List<String>>();
        mapList.put("File", fileList);
        mapList.put("Bouquet", flowerList);
        mapList.put("Instruments", instrumentList);

        String s = null;
        for (Map.Entry<String, List<String>> entry : mapList.entrySet()){
            s = s + entry.getValue();
    }
        CollectionToFile saveFile = new CollectionToFile();
        saveFile.printOut(s);
    }
}
