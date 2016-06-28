package ua.com.westwind.module09;

import java.io.*;

public class Cesar {

public static void main(String[] args) throws IOException {

        Collection test = new Collection();
        test.printOut();

        File f = new File("C:\\TextFile.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                // Code
                if (line.isEmpty())
                    throw new RuntimeException("Line is empty");
                String res = "";
                for (int i = 0; i < line.length(); i++)
                    res += EncryptChar(line.charAt(i));
                System.out.println("Закодированая коллекция");
                System.out.println(res);
                // Decode
                String codedText = res;
                    if (codedText.isEmpty())
                        throw new RuntimeException("resDecode = is empty, nothing to decode");
                    String resDecode = "";
                    for (int i=0; i<codedText.length(); i++)
                        resDecode += DecryptChar(codedText.charAt(i));
                System.out.println("Разкодированая коллекция");
                System.out.println(resDecode);
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
