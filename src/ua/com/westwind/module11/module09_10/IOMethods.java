package ua.com.westwind.module11.module09_10;

import java.io.*;
import java.nio.charset.Charset;

public class IOMethods {

    public void write(String line) {
        try {
            Charset charset = Charset.forName("US-ASCII");
            FileOutputStream fos = new FileOutputStream("TextFile.txt");
            Writer out = new OutputStreamWriter(fos, charset);
            out.write(line);
            out.close();

        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public String read(String line) {
        StringBuffer buffer = new StringBuffer();
        try {
            Charset charset = Charset.forName("US-ASCII");
            FileInputStream fis = new FileInputStream("TextFile.txt");
            InputStreamReader isr = new InputStreamReader(fis, charset);
            Reader in = new BufferedReader(isr);
            int ch;
            while ((ch = in.read()) > -1) {
                buffer.append((char) ch);
            }
            in.close();
            line = buffer.toString() + "\n";
            return line;

        } catch (IOException e) {
            e.printStackTrace();
                /*return null;*/
        }
        return line;
    }
}
