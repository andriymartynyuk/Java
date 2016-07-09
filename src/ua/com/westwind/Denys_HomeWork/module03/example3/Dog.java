package ua.com.westwind.Denys_HomeWork.module03.example3;

public class Dog {
    int t;
    static int q;

    static{
        System.out.println("Dog.static block1");
        q++;
        //t++;
    }

    {
        t++;
        q++;
        System.out.println("\tDog.block1");
    }

    {
        System.out.println("\tDog.block2");
    }

    public Dog() {
        System.out.println("\tDog.Constructor");
    }


    static{
        System.out.println("Dog.static block2");
    }
}
