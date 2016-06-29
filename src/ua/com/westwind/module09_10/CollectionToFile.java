package ua.com.westwind.module09_10;

import java.io.*;

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

