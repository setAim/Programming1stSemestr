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
        //Math.abs()
        //this.number = (int) value;
        //this.letter = c;
    }

    public int getNumber() {
        return number;
    }

    public char getLetter() {
        return letter;
    }
}
