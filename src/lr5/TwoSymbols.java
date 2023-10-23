package lr5;

public class TwoSymbols {
    private char firstChar;
    private char secondChar;

    public TwoSymbols(){
    }

    public TwoSymbols(char firstChar, char secondChar){
        this.firstChar = firstChar;
        this.secondChar = secondChar;
    }

    public void printAllBetween(){
        int firstCode = (int) firstChar;
        int secondCode = (int) secondChar;
        if (firstChar < secondChar) {
            for (int i = firstCode; i <= secondCode; i++){
                System.out.print((char)i);
            }
        } else if (firstChar > secondChar) {
            for (int i = secondCode; i <= firstCode; i++){
                System.out.print((char)i);
            }
        } else {
            System.out.print(firstChar + "" + secondChar);
        }
    }
}
