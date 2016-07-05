package ua.com.westwind.module11.module09_10;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Make Collection
        InputCollection map = new InputCollection();
        String line = map.colList();

        //Write Collection to file
        IOMethods writeCollection = new IOMethods();
        writeCollection.write(line);

        //Read from file
        IOMethods readFile = new IOMethods();
        System.out.println("Коллекция записана в файл, Charset 'US-ASCII'. Содержание файла: ");
        System.out.println(readFile.read(line));

        //Crypt file
        String inputTextForEncrypt = new IOMethods().read("TextFile.txt");
        Encryption encrypt = new Caesar();
        encrypt.caesarEncrypt(inputTextForEncrypt);

        //Decrypt file
        String inputTextForDecrypt = new IOMethods().read("TextFile.txt");
        Encryption decrypt = new Caesar();
        decrypt.caesarDecrypt(inputTextForDecrypt);
    }
}
