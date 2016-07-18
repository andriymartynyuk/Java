package ua.com.westwind.Denys_HomeWork.module07.app;

import org.junit.*;

import static org.junit.Assert.assertTrue;

public class HelloTest {

    @BeforeClass
    public static void beforeClass()throws Exception{
        System.out.println("@Before class");
    }

    @Before
    public void beforeMethod(){
        System.out.println("@Before method");
    }

    @Test(expected = java.lang.Exception.class)
    public void helloTest(){
        int a=1;
        int b=2;
        int res=a+b;
        //assertTrue(res==3);
        System.out.println("helloTest2()."+hashCode());
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis()-start<1000){
        }
        String s=null;
        s.hashCode();
    }

    @After
    public void afterMethod(){
        System.out.println("@After method");
    }


    @Test(expected = java.lang.Exception.class)
    public void helloTest1(){
        int a=1;
        int b=2;
        int res=a+b;
        //assertTrue(res==3);
        System.out.println("helloTest1()."+hashCode());
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis()-start<1000){
        }
        String s=null;
        s.hashCode();
    }


    @AfterClass
    public static void afterClass(){
        System.out.println("@After class");
    }

}
