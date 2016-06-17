package ua.com.westwind.MyTest;

public class NagativAgeException extends Exception{
    private int ageValue;

    public NagativAgeException(final int ageValue) {
        this.ageValue = ageValue;
    }

    public int getAgeValue() {
        return ageValue;
    }
}
