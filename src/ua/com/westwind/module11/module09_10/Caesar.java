package ua.com.westwind.module11.module09_10;

public class Caesar implements Encryption {

    //Encrypt
    @Override
    public void caesarEncrypt(String text) {
        if (text.isEmpty())
           throw new RuntimeException("Text is empty");

        String res = "";
        for (int i = 0; i < text.length(); i++)
            res += EncryptChar(text.charAt(i));
        System.out.println("Закодированая коллекция: ");
        System.out.println(res+"\n");

        //Wright result to file
        IOMethods writeCollection = new IOMethods();
        writeCollection.write(res);
    }

    // Decrypt
    @Override
    public void caesarDecrypt(String text) {
        if (text.isEmpty())
            throw new RuntimeException("Text is empty");

        String res = "";
        for (int i = 0; i < text.length(); i++)
            res += DecryptChar(text.charAt(i));

        System.out.println("Разкодированая коллекция: ");
        System.out.println(res+"\n");

        //Write result to file
        IOMethods writeCollection = new IOMethods();
        writeCollection.write(res);
    }

    // Шифровать мимвол
    private static char EncryptChar(char c) {
        return c == Character.MAX_VALUE ? '\0' : (char) (c + 3);
    }

    // Расшифровать символ
    private static char DecryptChar(char c) {
        return c == '\0' ? Character.MAX_VALUE : (char) (c - 3);
    }
}
