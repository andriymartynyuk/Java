package ua.com.westwind.module09_10;

import java.io.*;
import java.util.List;

public class CollectionToFile {

    public void printOut(String s) {
        try
        {
            FileOutputStream fileOut = new FileOutputStream("TextFile.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s);
            out.close();
            fileOut.close();
            System.out.println("Запись в файл окончена"+"\n");
        }catch(IOException i)
        {
            i.printStackTrace();
        }

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