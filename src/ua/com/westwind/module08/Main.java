package ua.com.westwind.module08;
import java.util.*;

public class Main {
    public static void main(String[] args) {

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

        /*for (String i : fileList) {
            System.out.print(i+" ");
        }*/

        Map<String, List<String>> mapList = new HashMap<String, List<String>>();
        mapList.put("File", fileList);
        mapList.put("Bouquetimpl", flowerList);
        mapList.put("Instruments", instrumentList);

        mapList.forEach((k,v)->System.out.println("\t"+k+"|\t"+v));


        /*for (Map.Entry<String, List<String>> entry : mapList.entrySet()) {
            entry.getKey();
            entry.getValue();
            System.out.println("\t"+entry.getKey()+"|\t"+entry.getValue());

        }*/




    }
}









        /*JTable buildTable (Map<?,?> mapList) {
            JTable Model = new DefaultTableModel(new Object[] { "Key", "Value" }, 0);
            for (Map.Entry<?,?> entry : map.entrySet()) {
                Model.addRow(new Object[] { entry.getKey(), entry.getValue() });
            }
            return Model;
        }*/

       /* JTable buildTable(Map<String,List> mapList){

            String columnNames[] = { "MyString", "MyFloat" };
            Object[][] data = new Object[mapList.size()][2];
            int i = 0;
            for(Map.Entry<String, List> entry : mapList.entrySet()) {

                data[i][0] = entry.getKey();
                data[i][1] = entry.getValue().toString();
                i++;
            }

            JTable table = new JTable(data, columnNames);

            System.out.println(table);
            *//*return table;*//*
        }*/

        /*SimpleTableDemo table = new SimpleTableDemo();*/
        /*String[] columnNames = {mapList.keySet().toString()};

        Object[][] data = {};*/

        /*System.out.println(table(mapList.keySet(),mapList.values()));*/

/*        String[] columnNames = {};
        Object[][] data = {};*/

        /*System.out.println("\n"+mapList);*/
        /*mapList.forEach((k,v)->System.out.println("columName : " + k + " data : " + v));*/


        /*mapList.forEach((k,v)-> {
            System.out.println("Item : " + k + " Count : " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        }*/

        /*fileList.forEach(System.out::print);*/
        /*System.out.println(Arrays.toString(fileList.toArray()));*/
        /*System.out.println(fileList);*/
        /*for (Iterator n = fileList.iterator(); n.hasNext();) {
            if(n.hasNext()){
            }
        }*/
        /*for (Map.Entry<String,List> entry : mapList.entrySet()) {
            String key = entry.getKey();
            String value = mapList.values().toString();
            System.out.println(key + " " + value);
            System.out.println(value);
        }*/