package lr5;

public class MaxAndMin {
    private int min;
    private int max;

    public MaxAndMin(){
        this.min = 0;
        this.max = 1;
    }

    public MaxAndMin(int min, int max){
        int absoluteMin;
        int absoluteMax;

        absoluteMin = Math.min(min,max);
        absoluteMax = Math.max(min,max);

        this.min = absoluteMin;
        this.max = absoluteMax;
    }

    public void putValue(int min){
        int absoluteMin;
        int absoluteMax;

        absoluteMin = Math.min(min,this.min);
        absoluteMin = Math.min(absoluteMin,this.max);

        absoluteMax = Math.max(min,this.min);
        absoluteMax = Math.max(absoluteMax,this.max);

        this.min = absoluteMin;
        this.max = absoluteMax;
    }

    public void putValue(int min, int max){
        int absoluteMin;
        int absoluteMax;

        absoluteMin = Math.min(min,this.min);
        absoluteMin = Math.min(absoluteMin,this.max);
        absoluteMin = Math.min(absoluteMin,max);

        absoluteMax = Math.max(min,this.min);
        absoluteMax = Math.max(absoluteMax,this.max);
        absoluteMax = Math.max(absoluteMax,max);

        this.min = absoluteMin;
        this.max = absoluteMax;
    }

    public void printValue(){
        System.out.println("min: " + this.min + ", max: " + this.max);
    }

}
