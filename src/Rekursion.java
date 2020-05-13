public class Rekursion {

    public static void countup(int n){
        if(n>0){
            countup(n-1);
            System.out.println("Countup ..."+n);
        }
    }

    public static void main(String[] args) {
        countup(5);
    }
}
