package lr5;

public class CharAndInt {
    private int number;
    private char letter;

    public CharAndInt(){
    }
    public CharAndInt(int i, char c){
        this.number = i;
        this.letter = c;
    }

    public CharAndInt(double d){
        int i = (int) d; //"теряем" дробную часть
        this.letter = (char) i;
        double diff = d - i;
        String s = String.valueOf(diff);
        s = s.substring(2,4); //0.12340... - изначальная строка, берем символы 2 и 3.
        this.number = Integer.parseInt(s);
    }

    public int getNumber() {
        return number;
    }

    public char getLetter() {
        return letter;
    }
}
