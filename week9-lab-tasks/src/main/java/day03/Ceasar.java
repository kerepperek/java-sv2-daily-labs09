package day03;

public class Ceasar extends Encryption {

    private int offset;
    private int multiplicator = 2;

    public Ceasar(int offset, int multiplicator) {
        this.offset = offset;
        this.multiplicator = multiplicator;
    }

    @Override
    public String encrypts(String input) {
        char[] result = input.toUpperCase().toCharArray();
        for (int counter = 0; counter < result.length; counter++) {
            result[counter] = getEncryptedChar(result[counter]);
        }
        return new String(result);
    }

    private char getEncryptedChar(char c) {

        for (int counter = 1; counter <= multiplicator; counter++) {
            c+=offset;
           if(c>'Z'){
               c-='Z'-'A'+1;
           }
        }
        return c;
    }
}
