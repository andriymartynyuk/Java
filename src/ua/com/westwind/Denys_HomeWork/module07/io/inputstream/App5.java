/*
package ua.com.westwind.Denys_HomeWork.module07.io.inputstream;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

*/
/**
 * Created by Администратор on 14.07.2016.
 *//*

public class App5 {

    public static void main(String[] args) throws Exception {
        try {
            String str = null;
            str.hashCode();
        } catch (Exception ex) {
            try (PrintStream filePrintStream = new PrintStream(new FileOutputStream(new File("trace.log")));) {
                ex.printStackTrace(filePrintStream);
            }

        }

        try {
            String str = null;
            str.hashCode();
        } catch (Exception ex) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            try (PrintStream filePrintStream = new PrintStream(out);) {
                ex.printStackTrace(filePrintStream);
            }
            String errorMessage = new String(out.toByteArray());
            JOptionPane.showMessageDialog(null, errorMessage);

        }



       */
/*
        try (PrintStream filePrintStream = new PrintStream(out);) {


        }*//*

    }
}*/
