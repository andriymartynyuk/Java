package ua.com.westwind.module11.module09_10;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class IOMethodsTest {

    @Test(timeout = 1000)
    public void write() throws Exception {
        Map<String, List<String>> mapList = new HashMap<String, List<String>>();
        mapList.put("Test", Arrays.asList("MyTest", "new", "1"));
        final String exportMapList = mapList.toString();

        IOMethods ioTest = new IOMethods();
        final Boolean result = ioTest.write(exportMapList);

        Assert.assertTrue(result);
        //Assert.assertFalse("Write false ",result);
    }

    @Test(timeout = 1000)
    public void read() throws Exception {
        Boolean result;
        IOMethods ioTest = new IOMethods();
        String text = ioTest.read("TextFile.txt");

        if ((text != null) && (text.trim().length() > 0)) {
            result = true;
        } else {
            result = false; }

        //Assert.assertTrue(result);
        Assert.assertFalse(result);
    }

}





/*IOMethods ioTest = new IOMethods();
  InputCollection mapList = new InputCollection();
  ioTest.write(mapList.colList());*/


//File file = new File("test.txt");
//FileReader file = new FileReader("test.txt");
//File file = File.createTempFile("test", ".tmp");
//System.out.println("Temp file : " + tmpFile.getAbsolutePath());
//BufferedWriter tmpFile = new BufferedWriter(new FileWriter(File.createTempFile("test", ".tmp")));