package ua.com.westwind.module09_10;

import java.io.*;

public class Cesar {

public static void main(String[] args) throws IOException {

    Collection collection = new Collection();
    collection.colList();

    File f = new File("TextFile.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                // Code
                if (line.isEmpty())
                    throw new RuntimeException("Line пустой");
                String res = "";
                for (int i = 0; i < line.length(); i++)
                    res += EncryptChar(line.charAt(i));
                System.out.println("Закодированая коллекция");
                System.out.println(res+"\n");
                // Decode
                String codedText = res;
                    if (codedText.isEmpty())
                        throw new RuntimeException("resDecode = пустой, нечего декодировать");
                    String resDecode = "";
                    for (int i=0; i<codedText.length(); i++)
                        resDecode += DecryptChar(codedText.charAt(i));
                System.out.println("Разкодированая коллекция");
                System.out.println(resDecode+"\n");
            }
        }finally{
                br.close();
            }
 }


    private static char EncryptChar(char c) {
        return c == Character.MAX_VALUE ? '\0' : (char) (c + 3);
    }

    private static char DecryptChar(char c) {
        return c == '\0' ? Character.MAX_VALUE : (char) (c - 3);
    }
}
