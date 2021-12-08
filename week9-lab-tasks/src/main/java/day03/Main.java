package day03;

public class Main {

    public static void main(String[] args) {
        Encryption encryption=new Ceasar(13,2);
        String result=encryption.encrypts("APPLE");
        System.out.println(result);
    }
}
