package ua.com.westwind.Denys_HomeWork.module05.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by Администратор on 30.06.2016.
 */
public class App1 {

    public static void main(String[] args)  {
       // String str="asadas";
       // int t=Integer.parseInt(str);
        //String str1=null;
        //str1.hashCode();
        //return;
        /*if(1<2){
            return;
        }*/


        //Throwable
        // Error       Exception
          //           Checked                                   RuntimeException
            //            FileNotFoundException                   NullPointer, NumberFormat, ...

        try {
            //String s =null;
            //s.hashCode();
            System.out.println("try");
            InputStream in = new FileInputStream(new File("c1://res.txt"));
            //return;
        }catch(FileNotFoundException ex){
            //ex.printStackTrace();
            System.out.println("Exception");
            //return;
        }catch(Exception ex){
            System.out.println("Exception1");
        }catch(Throwable ex){
            System.out.println("Exception2");
        }
        finally{
            System.out.println("Finally");
        }
    }
}
