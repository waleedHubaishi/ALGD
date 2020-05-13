public class Backtracking {

    static int[] weights = new int[]{7,6,5,3};
    static int[] values = new int[]{70,54,50,24};
    static int capacity = 9, totWeight =0, totValue = 0, maxValue = 0, itemValue=0, itemWeight=0;

    public static int getMaxValue(){
        maxValue = 0;
        pack(0);
        return maxValue;
    }

    static void pack(int i){
        if(i<weights.length){
            pack(i+1);
            packItem(i);
            itemValue=values[i];
            itemWeight=weights[i];
            pack(i+1);
            unpackItem(i);


        }

        else if(totWeight<=capacity && totValue>maxValue){
            maxValue = totValue;
        }
    }

    static void packItem(int i){
        totValue+=values[i];
        totWeight+=weights[i];
    }

    static void unpackItem(int i){
        totValue-=values[i];
        totWeight-=weights[i];
    }

    public static void main(String[] args) {
        System.out.println(getMaxValue());
    }

}
