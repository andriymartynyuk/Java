package ua.com.westwind.module06.musicShop2;

public class Instruments {
    private String name;
    private Integer quontity;

    public Instruments(String name, Integer quontity){
        this.name = name;
        this.quontity = quontity;
    }

    @Override
    public String toString() {
        return "Instruments{" +
                "name='" + name + '\'' +
                ", quontity=" + quontity +
                '}';
    }
}
