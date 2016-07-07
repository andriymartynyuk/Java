package ua.com.westwind.module11.module09_10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class InputCollectionTest {

    @Before
    public void setUp() throws Exception {
        Map<String, List<String>> mapList = new HashMap<String, List<String>>();
        mapList.put("Test", Arrays.asList("MyTest", "new", "1") );
    }

    @Test(timeout = 1000)
    public void colList() throws Exception {
        InputCollection test = new InputCollection();
        final String result = test.colList();
        String[] myStringArray = {"a","b","c"};
        Assert.assertEquals(Arrays.asList(myStringArray), Arrays.asList(result));
    }

}