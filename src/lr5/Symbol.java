package lr5;

public class Symbol {
    private char symb;

    public Symbol() {

    }
    public Symbol(char symb) {
        this.symb = symb;
    }

    public void setSymb(char symb) {
        this.symb = symb;
    }

    public int returnSymbCode(){
        int code = (int) symb;
        return code;
    }

    public void printSymb(){
        System.out.println("Символ: " + symb + ", код: " + ((int) symb));
    }
}
