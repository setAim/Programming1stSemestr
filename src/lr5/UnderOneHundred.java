package lr5;

public class UnderOneHundred {
    private int number;

    public UnderOneHundred(){
        this.number = 0;
    }

    public UnderOneHundred(int number){
        if (number <= 100) this.number = number;
        else {
            this.number = 100;
        }
    }

    public void placeNumber(){
        this.number = 0;
        //return number;
    }

    public void placeNumber(int input){
        if (input <= 100) {
            this.number = input;
            //return number;
        } else {
            this.number = 100;
            //return number;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean checkNumber(){
        int check = this.getNumber();
        return check <= 100;
    }
}
